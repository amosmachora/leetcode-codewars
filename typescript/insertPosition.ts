function searchInsert(nums: number[], target: number): number {
  if (nums.length === 0 || target < nums[0]) {
    return 0;
  }

  const indexOfTarget = nums.indexOf(target);
  if (indexOfTarget !== -1) {
    return indexOfTarget;
  }

  for (let i = 0; i < nums.length; i++) {
    const num = nums[i];

    if (num > target) {
      return i;
    }

    // if we are at the last number
    if (i === nums.length - 1) {
      return nums.length;
    }
  }

  return 0;
}
