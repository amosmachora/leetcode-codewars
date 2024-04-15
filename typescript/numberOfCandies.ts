function kidsWithCandies(candies: number[], extraCandies: number): boolean[] {
  const resultsArray: boolean[] = [];

  const greatestNumberOfCandies = Math.max(...candies);

  for (let i = 0; i < candies.length; i++) {
    const kidIsCandies = candies[i];
    resultsArray.push(kidIsCandies + extraCandies >= greatestNumberOfCandies);
  }

  return resultsArray;
}
