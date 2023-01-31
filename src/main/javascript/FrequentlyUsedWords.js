function topThreeWords(text) {
  var wordArray = text
    .split(" ")
    .map(function (word) {
      return word
        .toLowerCase()
        .replace(/[^a-zA-Z\s']+/g, "")
        .replace(/^'|'$/g, "");
    })
    .filter((word) => word !== "");

  var sortedArrayOfWordObjects = wordArray
    .map(function (testWord) {
      var count = 0;
      wordArray.forEach(function (word) {
        if (word === testWord) {
          count++;
        }
      });
      return {
        word: testWord,
        noOfOccurrences: count,
      };
    })
    .sort(function (a, b) {
      return b.noOfOccurrences - a.noOfOccurrences;
    });

  var uniqueWords = sortedArrayOfWordObjects
    .reduce(function (acc, curr) {
      if (
        !acc.find(function (_a) {
          var word = _a.word;
          return word === curr.word;
        })
      ) {
        acc.push(curr);
      }
      return acc;
    }, [])
    .map(function (item) {
      return item.word;
    });
  return uniqueWords.length === 0 ? [] : uniqueWords.slice(0, 3);
}
