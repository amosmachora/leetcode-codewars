/**
 * @param array1 the first array
 * @param array2 the second array
 * @returns true or false if all elements in array1 have corresponding squares on the second array;
 * @see https://www.codewars.com/kata/550498447451fbbd7600041c/train/javascript
 * @see https://medium.com/@amosmachora I have a series on medium of codewars problem. Please follow.
 */
function comp(array1, array2) {
    if (array1 === null || array2 === null) {
        return false;
    }
    if (array1.length === 0 && array2.length === 0) {
        return true;
    }
    var array1Squared = array1.map(function (x) { return x * x; }).sort(function (a, b) { return a - b; });
    var array2Sorted = array2.sort(function (a, b) { return a - b; });
    return JSON.stringify(array1Squared) === JSON.stringify(array2Sorted);
}
