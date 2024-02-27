reverseString = (lengthOfString, string) => {
    if (lengthOfString === 0) {
        return '';
    }
    return (string[lengthOfString - 1] + reverseString(lengthOfString - 1, string));
}
console.log(reverseString(5, 'apple'));
