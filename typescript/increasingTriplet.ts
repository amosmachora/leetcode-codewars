function increasingTriplet(nums: number[]) {
  let smallest = Infinity;
  let secondSmallest = Infinity;

  for (let num of nums) {
    if (num <= smallest) {
      smallest = num;
    } else if (num <= secondSmallest) {
      secondSmallest = num;
    } else {
      // Found the increasing triplet
      return true;
    }
  }

  return false;
}
