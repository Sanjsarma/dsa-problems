reverseNumber = (numberOfDigits, number) => {
    if (numberOfDigits === 0) {
        return 0;
    }
    let unitsPlace = number % 10; //3 2 1 
    let tensPlace = unitsPlace * (Math.pow(10, (numberOfDigits - 1))); //3*100=300 20 1
    return (tensPlace + reverseNumber(numberOfDigits - 1, Math.round(number / 10))); //300+reverseNumber(2, 12)
}
console.log(reverseNumber(3, 123));
