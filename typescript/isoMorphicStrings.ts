function isIsomorphic(s: string, t: string): boolean {
  const map = new Map<string, string>();

  for (let i = 0; i < s.length; i++) {
    const charS = s[i];
    const charT = t[i];

    // If the character in s is already mapped but not to the same character in t
    if (map.has(charS) && map.get(charS) !== charT) {
      return false;
    }

    // If the character in s is not yet mapped, but the character in t is already mapped to another character in s
    if (!map.has(charS) && [...map.values()].includes(charT)) {
      return false;
    }

    map.set(charS, charT); // Map charS in s to charT in t
  }

  return true;
}
