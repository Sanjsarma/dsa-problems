sumOfArray = (array, length) => {
    if(length === 0) {
        return 0;
    }
    return array[length-1] + (sumOfArray(array,length-1));
}

console.log(sumOfArray([1,2,3,4,5], 5));
