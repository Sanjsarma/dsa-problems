digitSum = (number) => {
    if (number < 1) {
        return 0;
    }
    return (number % 10 + Math.floor(digitSum(number / 10)))
}
console.log(digitSum(12345));
