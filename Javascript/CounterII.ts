type ReturnObj = {
  increment: () => number;
  decrement: () => number;
  reset: () => number;
};

function createCounter(init: number): ReturnObj {
  let storedValue = init;

  const increment = () => {
    return ++storedValue;
  };
  const decrement = () => {
    return --storedValue;
  };
  const reset = () => {
    storedValue = init;
    return init;
  };

  return {
    increment,
    decrement,
    reset,
  };
}

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */
