type Fn = (accum: number, curr: number) => number;

function reduce(nums: number[], fn: Fn, init: number): number {
  if (nums.length === 0) {
    return init;
  }

  let temp = init;

  for (let i = 0; i <= nums.length; i++) {
    const element = nums[i];

    const transformed = fn(temp, element);

    temp += transformed;
  }

  return temp;
}
