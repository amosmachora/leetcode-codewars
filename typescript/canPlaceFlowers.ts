function canPlaceFlowers(flowerbed: number[], n: number): boolean {
  let plantableFlowers = 0;
  const mutableCopy = [...flowerbed];

  if (mutableCopy.length === 1) {
    if (mutableCopy[0] === 0) {
      return n <= 1; // Return true if there's one or fewer spots and the spot is empty
    } else {
      return n === 0; // Return true if there are no spots to plant and the spot is not empty
    }
  }

  // Check for the first spot
  if (mutableCopy[0] === 0 && mutableCopy[1] === 0) {
    mutableCopy[0] = 1;
    plantableFlowers++;
  }

  for (let i = 1; i < mutableCopy.length - 1; i++) {
    const plot = mutableCopy[i];
    const nextPlot = mutableCopy[i + 1];
    const previousPlot = mutableCopy[i - 1];

    // middle plots
    if (nextPlot === 0 && previousPlot === 0 && plot === 0) {
      mutableCopy[i] = 1;
      plantableFlowers++;
    }
  }

  // Check for the last spot
  if (
    mutableCopy[mutableCopy.length - 1] === 0 &&
    mutableCopy[mutableCopy.length - 2] === 0
  ) {
    mutableCopy[mutableCopy.length - 1] = 1;
    plantableFlowers++;
  }

  return plantableFlowers >= n;
}
