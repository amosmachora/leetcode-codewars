function rot13(str) {
  const allLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  let rot13String = "";

  str.split("").forEach((letter) => {
    if (allLetters.includes(letter.toUpperCase())) {
      const indexOfCurrentLetter = allLetters.indexOf(letter.toUpperCase());
      let rotatedIndex = (indexOfCurrentLetter + 13) % 26;
      let rotatedLetter = allLetters[rotatedIndex];

      if (letter === letter.toUpperCase()) {
        rot13String += rotatedLetter;
      } else {
        rot13String += rotatedLetter.toLowerCase();
      }
    } else {
      rot13String += letter;
    }
  });

  return rot13String;
}

console.log(rot13("SERR PBQR PNZC"));
