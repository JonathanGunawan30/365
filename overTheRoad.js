// function overTheRoad(address, n){
//     const firstRoad = [];
//     const secondRoad = [];

//     for(let i = 1; i <= (n * 2); i ++){
//         if(i % 2 !== 0){
//             firstRoad.push(i);
//         } else {
//             secondRoad.push(i);
//         }
//     }
//     secondRoad.reverse();

//     if(address % 2 !== 0){
//         let index = firstRoad.indexOf(address);
//         return secondRoad[index];
//     } else {
//         index = secondRoad.indexOf(address);
//         return firstRoad[address];
//     }

// }


// function overTheRoad(address, n){
//     return (n * 2 + 1) - address
// }

const overTheRoad = (address, n) => (n * 2 + 1) - address;


console.log(overTheRoad(23633656673, 310027696726));