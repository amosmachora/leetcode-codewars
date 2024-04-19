function productExceptSelf(nums: number[]): number[] {
  const n = nums.length;

  const leftProducts: number[] = new Array(n).fill(1);
  const rightProducts: number[] = new Array(n).fill(1);

  for (let i = 1; i < n; i++) {
    leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
  }

  for (let i = n - 2; i >= 0; i--) {
    rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
  }

  const result: number[] = [];
  for (let i = 0; i < n; i++) {
    result.push(leftProducts[i] * rightProducts[i]);
  }

  return result;
}
