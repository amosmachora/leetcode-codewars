const validVowels = "aeiou";

function reverseVowels(s: string): string {
  const reversed: string[] = [];

  //extract the vowels
  let extractedVowels = [];

  for (let i = 0; i < s.length; i++) {
    const char = s[i];
    if (validVowels.includes(char.toLowerCase())) {
      extractedVowels.push(char);
    }
  }

  const reversedVowels = extractedVowels.reverse();

  for (let i = 0; i < s.length; i++) {
    const char = s[i];
    if (!validVowels.includes(char.toLowerCase())) {
      reversed.push(char);
    } else {
      reversed.push(reversedVowels[0]);
      reversedVowels.shift();
    }
  }

  return reversed.join("");
}
