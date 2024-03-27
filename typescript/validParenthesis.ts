function isValid(s: string): boolean {
  const validParenthesisMap = new Map<string, string>();
  validParenthesisMap.set("(", ")");
  validParenthesisMap.set("[", "]");
  validParenthesisMap.set("{", "}");

  const stack: string[] = [];

  for (const char of s) {
    if (validParenthesisMap.has(char)) {
      stack.push(char); // Push opening parentheses onto the stack
    } else {
      const lastOpeningParen = stack.pop();
      if (
        !lastOpeningParen ||
        validParenthesisMap.get(lastOpeningParen) !== char
      ) {
        return false; // Mismatched or extra closing parentheses
      }
    }
  }

  return stack.length === 0; // Check if all parentheses are matched
}
