function ValidarFormulario() {
  event.preventDefault();
  let nomePessoa = document.forms['formCadastro']['nome'].value;
  let email = document.forms['formCadastro']['email'].value;
  if (nomePessoa == '') {
    alert('Por favor, preencha o campo nome completo');
  } else if (email == '') {
    alert('Por favor, preencha o campo email.');
  } else {
    alert('Nome: ' + nomePessoa + '\nEmail: ' + email);
    event.preventDefault();
  }
}
