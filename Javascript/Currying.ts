function add(n) {
  const next = (m) => add(n + m);
  next.valueOf = () => n;
  return next;
}
console.log(add(1)(2)(3)(4));
