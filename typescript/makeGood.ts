function makeGood(s: string): string {
  if (s === "") {
    return s;
  }

  let copy = s;

  let replaced = false;

  for (let i = 0; i < s.length - 1; i++) {
    const char = copy[i];
    const adjacentChar = copy[i + 1];

    if (isLowerCase(char) && isSameLetterButUpperCase(char, adjacentChar)) {
      copy = copy.slice(0, i) + copy.slice(i + 2);
      replaced = true;
      break;
    }

    if (
      isLowerCase(adjacentChar) &&
      isSameLetterButUpperCase(adjacentChar, char)
    ) {
      copy = copy.slice(0, i) + copy.slice(i + 2);
      replaced = true;
      break;
    }
  }

  if (!replaced) {
    return copy;
  }

  return makeGood(copy);
}

function isLowerCase(char: string) {
  if (!char) {
    return false;
  }

  return char === char.toLowerCase();
}

function isSameLetterButUpperCase(a: string, b: string) {
  if (!a || !b) {
    return false;
  }
  return b === b.toUpperCase() && b.toUpperCase() === a.toUpperCase();
}
