function longestCommonPrefix(strs: string[]): string {
  if (strs.length === 0) {
    return ""; // No common prefix if the array is empty
  }

  let LCP = "";

  const firstWord = strs[0];

  for (let i = 0; i < firstWord.length; i++) {
    const char = firstWord[i];

    if (strs.every((word) => word[i] === char)) {
      LCP += char;
    } else {
      break; // Stop when the characters are not common
    }
  }

  return LCP;
}
