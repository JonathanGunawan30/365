function squarePi(digits){
    const pi = "31415926535897932384626433832795028841971693993751058209749445923078164062862089986280348253421170679";
    const piArr = pi.split("").map(Number);

    const arr = piArr.splice(0, digits);
    let result = 0;
    for(const data of arr){
        result += (data * data);
    }
    return Math.ceil(Math.sqrt(result));
}

console.log(squarePi(3));