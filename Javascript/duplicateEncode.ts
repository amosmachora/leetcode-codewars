function duplicateEncode(word: string): string {
  const lowerCaseWord = word.toLowerCase();
  let result = "";
  lowerCaseWord.split("").forEach((letter) => {
    const numberOfOccurrences = lowerCaseWord
      .split("")
      .filter((l) => l === letter).length;
    if (numberOfOccurrences === 1) {
      result += "(";
    } else {
      result += ")";
    }
  });

  return result;
}
