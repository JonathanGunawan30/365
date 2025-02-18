// function digitize(n){
//     return n.toString().split('').map(Number).reverse();
// }

const digitize = n => n.toString().split('').map(Number).reverse();


const result = digitize(35231);
console.log(result);