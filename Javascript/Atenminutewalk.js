/**
 *
 * @param {*} walk an array of string directions
 * @returns a boolean value indicating whether or not the walk is valid.
 * @see https://www.codewars.com/kata/54da539698b8a2ad76000228/train/javascript
 */
function isValidWalk(walk) {
  let nCount = 0;
  let sCount = 0;
  let eCount = 0;
  let wCount = 0;

  walk.forEach((direction) => {
    if (direction === "n") {
      nCount++;
    } else if (direction === "s") {
      sCount++;
    } else if (direction === "e") {
      eCount++;
    } else {
      wCount++;
    }
  });

  return nCount === sCount && eCount === wCount && walk.length === 10;
}

console.log(
  isValidWalk(["w", "e", "w", "e", "w", "e", "w", "e", "w", "e", "w", "e"])
);
