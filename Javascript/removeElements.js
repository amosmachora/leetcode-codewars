function removeElement(nums, val) {
  let i = 0;

  while (i < nums.length) {
    if (nums[i] === val) {
      nums.splice(i, 1);
    } else {
      i++;
    }
  }

  return nums.length;
}

removeElement([3, 2, 2, 3], 3);
