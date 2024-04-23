function compress(chars: string[]): number {
  for (let i = 0; i < chars.length; i++) {
    const char = chars[i];
    let lastIdxOfChar = i;

    for (let j = i + 1; j < chars.length; j++) {
      if (chars[j] !== char) {
        break;
      }
      lastIdxOfChar = j;
    }

    const groupLength = lastIdxOfChar - i + 1;

    if (groupLength > 1) {
      chars.splice(
        i,
        groupLength,
        ...[char, ...groupLength.toString().split("")]
      );
    }
  }

  return chars.length;
}
