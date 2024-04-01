function removeDuplicates(nums: number[]): number {
  for (let i = 0; i < nums.length; i++) {
    const num = nums[i];
    const idxOfNum = nums.indexOf(num);
    const lastIdxOfNum = nums.lastIndexOf(num);

    if (idxOfNum !== lastIdxOfNum) {
      // meaning we have duplicates.
      nums.splice(idxOfNum, lastIdxOfNum - idxOfNum);
    }
  }

  return nums.length;
}
