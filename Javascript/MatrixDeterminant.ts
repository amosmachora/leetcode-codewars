/**
 * @param m the matrix
 * @returns the determinant of the matrix
 * @see https://www.codewars.com/kata/52a382ee44408cea2500074c/train/javascript
 * @see https://medium.com/@amosmachora I have a series on medium where i explain codewars problems. Please follow.
 */
function determinant(m: number[][]): number {
  if (m.length === 1) {
    // A 1x1 matrix |a| has determinant a.
    return m[0][0];
  } else if (m.length === 2) {
    //A 2x2 has determinant: a*d - b*c.
    return m[0][0] * m[1][1] - m[1][0] * m[0][1];
  } else {
    // [
    //   [2, 3, 4],
    //   [2, 3, 4],
    //   [2, 3, 4],
    // ];
    const matrixSize = m.length;
    let det = 0;
    for (let i = 0; i < matrixSize; i++) {
      const subMatrix: number[][] = [];
      for (let j = 1; j < matrixSize; j++) {
        subMatrix.push(m[j].filter((_, k) => k !== i));
      }
      const coFactor = determinant(subMatrix);
      const sign = i % 2 === 0 ? 1 : -1;
      det += sign * m[0][i] * coFactor;
    }
    return det;
  }
}
