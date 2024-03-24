function isPalindrome(x: number): boolean {
  return x.toString().split("").reverse().join("") === x.toString();
}
