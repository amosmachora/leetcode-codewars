type ToBeOrNotToBe = {
  toBe: (val: any) => boolean;
  notToBe: (val: any) => boolean;
};

function expect(val: any): ToBeOrNotToBe {
  const toBe = (anotherValue: any) => {
    if (val === anotherValue) {
      return true;
    } else {
      throw new Error("Not Equal");
    }
  };
  const notToBe = (anotherValue: any) => {
    if (val !== anotherValue) {
      return true;
    } else {
      throw new Error("Equal");
    }
  };

  return {
    toBe,
    notToBe,
  };
}

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */
