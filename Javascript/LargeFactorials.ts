function factorial(n: number): string {
  let currentValue = n;
  let product: number = 1;
  while (currentValue !== 0) {
    product = product * currentValue;
    currentValue--;
  }
  return product.toString();
}

console.log(factorial(15));
