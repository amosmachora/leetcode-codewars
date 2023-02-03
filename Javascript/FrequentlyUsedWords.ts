export function topThreeWords(text: string): string[] {
    const wordArray = text
      .split(" ")
      .filter((word) => word !== "")
      .map((word) => word.toLowerCase().replace(/[^a-zA-Z\s`]/g, ""));
  
    const sortedArrayOfWordObjects = wordArray
      .map((testWord) => {
        let count = 0;
        wordArray.forEach((word) => {
          if (word === testWord) {
            count++;
          }
        });
        return {
          word: testWord,
          noOfOccurrences: count,
        };
      })
      .sort((a, b) => b.noOfOccurrences - a.noOfOccurrences);
  
    const uniqueWords = sortedArrayOfWordObjects
      .reduce<Array<{ word: string; noOfOccurrences: number }>>((acc, curr) => {
        if (!acc.find(({ word }) => word === curr.word)) {
          acc.push(curr);
        }
        return acc;
      }, [])
      .map((item) => item.word);
  
    return uniqueWords.length === 0 ? [] : uniqueWords.slice(0, 3);
  }
  
  console.log(topThreeWords("a a c b b"));