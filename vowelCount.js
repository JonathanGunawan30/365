function getCount(str){
    const arr = ['a', 'i', 'u', 'e', 'o']
    let result = 0;
    for (const string of str.split("")) {
        if(arr.includes(string)){
            result++
        }
    }
    return result;
}

console.log(getCount("abracadabra"))