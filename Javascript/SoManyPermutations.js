function permutations(string) {
  var output = [];
  if (string.length === 1) {
    output.push(string);
  } else {
    for (var i = 0; i < string.length; i++) {
      var element = string[i];
      var remainingCharacters = string.slice(0, i) + string.slice(i + 1);
      var remainingCharactersPermutations = permutations(remainingCharacters);
      for (
        var _i = 0,
          remainingCharactersPermutations_1 = remainingCharactersPermutations;
        _i < remainingCharactersPermutations_1.length;
        _i++
      ) {
        var permutation = remainingCharactersPermutations_1[_i];
        output.push(element + permutation);
      }
    }
  }
  return removeDuplicates(output);
}
function removeDuplicates(arr) {
  return arr.filter(function (item, index) {
    arr.indexOf(item) === index;
  });
}
