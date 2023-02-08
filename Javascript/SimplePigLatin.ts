function pigIt(str: string): string {
  return str
    .split(" ")
    .map((str) => {
      if (isSpecialCharacter(str)) {
        return str;
      } else {
        return (
          str.substring(str.length - 2) +
          str.substring(0, str.length - 2) +
          "ay"
        );
      }
    })
    .join(" ")
    .trim();
}
function isSpecialCharacter(str: string): boolean {
  const specialCharacters = "!@#$%^&*()_+-=[]{}|;':\"<>,.?/\\";
  return specialCharacters.includes(str);
}

pigIt("Pig latin is cool");
