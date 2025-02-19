function maps(x){
    const result = [];
    for(let i = 0; i < x.length; i++){
        result[i] = x[i] * 2;
    }
    return result;
}

console.log(maps([1,2,3]));