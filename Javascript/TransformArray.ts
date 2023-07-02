function map(arr: number[], fn: (n: number, i: number) => number): number[] {
  const newArray: number[] = [];

  for (let i = 0; i < arr.length; i++) {
    const element = arr[i];
    newArray.push(fn(element, i));
  }

  return newArray;
}
