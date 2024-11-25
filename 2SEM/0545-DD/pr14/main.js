import { Employee, Manager, Developer } from './employee.js';

const department = document.getElementById('department');
const language = document.getElementById('language');
const form = document.forms['form-register'];
const fields = form.querySelectorAll('input, select');
const MIN_AGE = 14;
const MAX_AGE = 100;

form.addEventListener('submit', submitForm);

fields.forEach((field) => {
  field.addEventListener('input', (event) => {
    event.target.removeAttribute('aria-invalid');
  });
});
/* fields.forEach((el) => el.addEventListener('change', resetFieldStyles));  */

document.getElementById('role').addEventListener('change', (event) => {
  const role = event.target.value;
  department.value = '';
  language.value = '';
  switch (role) {
    case 'Desenvolvedor':
      department.setAttribute('disabled', true);
      language.removeAttribute('disabled');
      break;
    case 'Gerente':
      department.removeAttribute('disabled');
      language.setAttribute('disabled', true);
      break;
    default:
      language.setAttribute('disabled', true);
      department.setAttribute('disabled', true);
      break;
  }
});

function submitForm() {
  event.preventDefault();

  const form = document.forms['form-register'];

  try {
    validateForm(form);
    
    const employeeData = getEmployeeData(form);

    const employeeInstance = instanceEmployee(...Object.values(employeeData));

    renderTable(employeeInstance);

    form.reset();

    showToast('Cadastrado com sucesso', 'success');

  } catch (error) {
    showToast(error.message, 'error');
  }
}

function validateForm(form) {
  const { name, age, role, department, language } = form;
  if (!name.value) {
    name.setAttribute('aria-invalid', true);
    throw new Error('O nome deve ser preenchido');
  }
  if (name.value.split(' ').length < 2) {
    name.setAttribute('aria-invalid', true);
    throw new Error('O nome deve conter nome e sobrenome');
  }
  if (!age.value) {
    age.setAttribute('aria-invalid', true);
    throw new Error('A idade deve ser preenchida');
  }
  if (isNaN(age.value)) {
    age.setAttribute('aria-invalid', true);
    throw new Error('A idade deve ser um valor numérico');
  }
  if (age.value < MIN_AGE || age.value > MAX_AGE) {
    age.setAttribute('aria-invalid', true);
    throw new Error('A idade deve ser apropriada');
  }
  if (!role.value) {
    role.setAttribute('aria-invalid', true);
    throw new Error('O cargo deve ser preenchido');
  }
  if (role.value === 'Desenvolvedor' && !language.value) {
    language.setAttribute('aria-invalid', true);
    throw new Error('A linguagem deve ser preenchida');
  }

  if (role.value === 'Gerente' && !department.value) {
    department.setAttribute('aria-invalid', true);
    throw new Error('O departamento deve ser preenchido');
  }

  if (role.value === 'Gerente' && department.value.length < 2) {
    department.setAttribute('aria-invalid', true);
    throw new Error('O departamento deve conter pelo menos 2 letras');
  }
  if (role.value === 'Desenvolvedor' && language.value.length < 2) {
    language.setAttribute('aria-invalid', true);
    throw new Error('A linguagem deve conter pelo menos 2 letras');
  }
}

function getEmployeeData(form) {
  const { name, age, role, department, language } = form;
  return {
    name: name.value,
    age: age.value,
    role: role.value,
    department: department?.value,
    language: language?.value,
  };
}

function showToast(message, type) {
  const color =
    type == 'error'
      ? 'linear-gradient(to right, #ff5f6d, #ffc371)'
      : 'linear-gradient(to right, #00b09b, #96c93d)';
  Toastify({
    text: message,
    gravity: 'top',
    position: 'center',
    duration: 2000,
    style: {
      background: color,
    },
  }).showToast();
}

function instanceEmployee(name, age, role, department, language) {
  switch (role) {
    case 'Desenvolvedor':
      return new Developer(name, age, role, language);
    case 'Gerente':
      return new Manager(name, age, role, department);
    default:
      return new Employee(name, age, role);
  }
}
function showTasks(employee) {
  if (employee instanceof Developer) {
    return employee.programming();
  } else if (employee instanceof Manager) {
    return employee.management();
  } else {
    return employee.work();
  }
}

function renderTable(employee) {
  const tbody = document.getElementById('table-employees');

  const row = document.createElement('tr');

  const tdName = document.createElement('td');
  const tdAge = document.createElement('td');
  const tdRole = document.createElement('td');
  const tdDepartment = document.createElement('td');
  const tdLanguage = document.createElement('td');
  const tdIntroduction = document.createElement('td');
  const tdTasks = document.createElement('td');

  tdName.textContent = employee.name;
  tdAge.textContent = employee.age;
  tdRole.textContent = employee.role;
  tdDepartment.textContent = employee?.department || 'N.A.';
  tdLanguage.textContent = employee?.language || 'N.A.';
  tdIntroduction.textContent = employee.introduceYourself();
  tdTasks.textContent = showTasks(employee);

  row.appendChild(tdName);
  row.appendChild(tdAge);
  row.appendChild(tdRole);
  row.appendChild(tdDepartment);
  row.appendChild(tdLanguage);
  row.appendChild(tdIntroduction);
  row.appendChild(tdTasks);
  tbody.appendChild(row);
}
