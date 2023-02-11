function factorial(n) {
  var currentValue = n;
  var product = 1;
  while (currentValue !== 0) {
    product = product * currentValue;
    currentValue--;
  }
  return product.toString();
}
console.log(factorial(15));
