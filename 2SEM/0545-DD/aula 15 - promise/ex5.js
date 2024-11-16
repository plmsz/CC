function processarItem(num) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      if (num % 2 === 0) {
        resolve(`${num} é par`);
      } else {
        reject(`${num} é ímpar`);
      }
    }, 1000);
  });
}

function processarTodasOuUma(array) {
  const promises = array.map((item) => processarItem(item));
  return Promise.all(promises); //total ou nada
}
function processarTodasPromises(array) {
  const promises = array.map((item) => processarItem(item));
  return Promise.allSettled(promises);
}

function executar(array) {
  processarTodasOuUma(array)
    .then((res) => {
      console.log("processarTodasOuUma", res);
    })
    .catch((err) => {
      console.log("processarTodasOuUma", err);
    });

  processarTodasPromises(array)
    .then((res) => {
      console.log("processarTodasPromises", res);
    })
    .catch((err) => {
      console.log("processarTodasPromises", err);
    });
}

executar([2, 3, 4]);
/* processarTodasOuUma 3 é ímpar
processarTodasPromises [
  { status: 'fulfilled', value: '2 é par' },
  { status: 'rejected', reason: '3 é ímpar' },
  { status: 'fulfilled', value: '4 é par' }
] */
executar([2, 4, 6]); 
/* processarTodasOuUma [ '2 é par', '4 é par', '6 é par' ]
processarTodasPromises [
  { status: 'fulfilled', value: '2 é par' },
  { status: 'fulfilled', value: '4 é par' },
  { status: 'fulfilled', value: '6 é par' }
] */

  let req1 = new Promise(function (resolve, reject) {
    setTimeout(function () {
      resolve('First!');
    }, 8000);
  });
  var req2 = new Promise(function (resolve, reject) {
    setTimeout(function () {
      resolve('Second!');
    }, 3000);
  });
  Promise.race([req1, req2]) // 3: segundos!
    .then(function (one) {
      console.log('3: ', one);
    })
    .catch(function (one, two) {
      console.log('Catch: ', one);
    }); 
 