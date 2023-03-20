function palindrome(str) {
  const justAlphaNumericString = getJustAlphaNumericString(str);
  if (
    justAlphaNumericString.split("").reverse().join("") ===
    justAlphaNumericString
  ) {
    return true;
  }

  return false;
}

function getJustAlphaNumericString(str) {
  const alphanumericRegex = /[^a-zA-Z0-9\s]/g;
  const strippedStr = str.replace(alphanumericRegex, "");

  const noSpaceStr = strippedStr.replace(/\s+/g, "");

  //   console.log(noSpaceStr.toLowerCase());

  return noSpaceStr.toLowerCase();
}

palindrome("_eye");
