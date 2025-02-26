function gps(s, x) {
    if(x.length <= 1) return 0;
    const result = x.map((num, i, arr) => {
        if(i > 0){
            return num - arr[i - 1];
        }
        return num;
    });
    return Math.floor((3600 * (Math.max(...result))) / s);
}

console.log(gps(15, [0.0, 0.19, 0.5, 0.75, 1.0, 1.25, 1.5, 1.75, 2.0, 2.25]));