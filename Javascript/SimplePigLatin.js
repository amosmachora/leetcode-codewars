/**
 *
 * @param {*} str a string
 * @returns pigged string
 * @see https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/javascript
 */
function pigIt(str) {
  return str
    .split(" ")
    .map(function (str) {
      if (isSpecialCharacter(str)) {
        return str;
      } else {
        return str.substring(1) + str[0] + "ay";
      }
    })
    .join(" ")
    .trim();
}

function isSpecialCharacter(str) {
  var specialCharacters = "!@#$%^&*()_+-=[]{}|;':\"<>,.?/\\";
  return specialCharacters.includes(str);
}

console.log(pigIt("Pig latin is cool"));
