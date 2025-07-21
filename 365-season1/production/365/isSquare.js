var isSquare = function(n){
    // for(i = 0; i <= n; i ++){
    //     if(i * i === n){
    //         return true;
    //     }
    // }
    // return false;
    if(n < 0) return false;
    let sqrt = Math.sqrt(n);
    return Number.isInteger(sqrt);
}

const result = isSquare(25);
console.log(result);