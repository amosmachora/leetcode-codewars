function convertToRoman(num) {
  const romanValues = new Map();
  romanValues.set("M", 1000);
  romanValues.set("CM", 900);
  romanValues.set("D", 500);
  romanValues.set("CD", 400);
  romanValues.set("C", 100);
  romanValues.set("XC", 90);
  romanValues.set("L", 50);
  romanValues.set("XL", 40);
  romanValues.set("X", 10);
  romanValues.set("IX", 9);
  romanValues.set("V", 5);
  romanValues.set("IV", 4);
  romanValues.set("I", 1);

  let roman = "";

  romanValues.forEach((value, key) => {
    while (num >= value) {
      roman += key;
      num -= value;
    }
  });

  return roman;
}

console.log(convertToRoman(1006));
