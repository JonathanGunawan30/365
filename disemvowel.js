function disemvowel(str) {
    const arr = ['a', 'i', 'u', 'e', 'o', 'A', 'I', 'U', 'E', 'O']
    let result = "";
    for (const string of str.split("")) {
        if(!arr.includes(string)){
            result += string
        }
    }

    return result;
}

console.log(disemvowel("This website is for losers LOL!"))