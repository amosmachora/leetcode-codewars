function filter(arr: number[], fn: (n: number, i: number) => any): number[] {
  const filteredArr: number[] = [];

  for (let i = 0; i < arr.length; i++) {
    const element = arr[i];
    const result = fn(element, i);
    if (result) {
      filteredArr.push(element);
    }
  }

  return filteredArr;
}
