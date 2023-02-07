function hamming(n) {
    var heap = [1];
    var set = new Set([1]);
    for (var i = 0; i < n - 1; i++) {
        var curr = heap[0];
        heap.shift();
        var next2 = curr * 2;
        var next3 = curr * 3;
        var next5 = curr * 5;
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
        heap.sort(function (a, b) { return a - b; });
    }
    return heap[0];
}
