function removeDuplicates(nums: number[]): number {
  for (let i = 0; i < nums.length; i++) {
    const num = nums[i];
    const currentNumberIdx = nums.indexOf(num);

    const numsWithoutCurrentNumber = nums.filter(
      (_, i) => i !== currentNumberIdx
    );

    if (numsWithoutCurrentNumber.includes(num)) {
      //meaning we found a duplicate
      nums.splice(currentNumberIdx, 1);
    }
  }

  return nums.length;
}
