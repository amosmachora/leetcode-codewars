function isPangram(string) {
  const inLowercase = string.toLowerCase();
  //...
  const allLetters = new Set([
    "a",
    "b",
    "c",
    "d",
    "e",
    "f",
    "g",
    "h",
    "i",
    "j",
    "k",
    "l",
    "m",
    "n",
    "o",
    "p",
    "q",
    "r",
    "s",
    "t",
    "u",
    "v",
    "w",
    "x",
    "y",
    "z",
  ]);

  const x = new Set([...str]);

  for (const letter of inLowercase) {
    if (allLetters.has(letter)) {
      allLetters.delete(letter);
    }
  }

  if (allLetters.size === 0) {
    return true;
  } else {
    return false;
  }
}

console.log(isPangram("The quick brown fox jumps over the lazy dog."));

// function isPangram(string) {
//   const mySet = new Set(string.toLowerCase());
//   return mySet.size === 26;
// }
