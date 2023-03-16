function permutations(string: string): string[] {
  const output: string[] = [];
  if (string.length === 1) {
    output.push(string);
  } else {
    for (let i = 0; i < string.length; i++) {
      const element = string[i];
      const remainingCharacters = string.slice(0, i) + string.slice(i + 1);
      const remainingCharactersPermutations = permutations(remainingCharacters);
      for (const permutation of remainingCharactersPermutations) {
        output.push(element + permutation);
      }
    }
  }
  return removeDuplicates(output);
}

function removeDuplicates<T>(arr: T[]): T[] {
  return arr.filter((item, index) => {
    arr.indexOf(item) === index;
  });
}
