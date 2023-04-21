function duplicateEncode(word) {
  const lowerCaseWord = word.toLowerCase();
  let result = "";
  lowerCaseWord.split("").forEach(function (letter) {
    var numberOfOccurrences = lowerCaseWord
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
