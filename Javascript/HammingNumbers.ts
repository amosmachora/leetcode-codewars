function hamming(n: number): number {
  const heap = [1];
  const set = new Set([1]);

  for (let i = 0; i < n - 1; i++) {
    const curr = heap[0];
    heap.shift();
    const next2 = curr * 2;
    const next3 = curr * 3;
    const next5 = curr * 5;

    if (!set.has(next2)) {
      heap.push(next2);
      set.add(next2);
    }
    if (!set.has(next3)) {
      heap.push(next3);
      set.add(next3);
    }
    if (!set.has(next5)) {
      heap.push(next5);
      set.add(next5);
    }

    heap.sort((a, b) => a - b);
  }

  return heap[0];
}
