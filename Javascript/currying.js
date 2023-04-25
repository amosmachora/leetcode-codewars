function add(n) {
    // Let the currying begin!
    function curry(m) {
        n += m;
        return curry;
    }
    curry.toString = function () {
        return n;
    };
    return function (m) {
        return curry(m);
    };
}
console.log(add(1)(2)(3)(4));
