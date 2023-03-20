function checkCashRegister(price, cash, cid) {
  const currencies = new Map([
    ["PENNY", 0.01],
    ["NICKEL", 0.05],
    ["DIME", 0.1],
    ["QUARTER", 0.25],
    ["ONE", 1],
    ["FIVE", 5],
    ["TEN", 10],
    ["TWENTY", 20],
    ["ONE HUNDRED", 100],
  ]);

  let totalCID = cid.reduce((acc, curr) => acc + curr[1], 0);
  let change = cash - price;
  let changeArray = [];

  if (totalCID < change) {
    return { status: "INSUFFICIENT_FUNDS", change: changeArray };
  }

  if (totalCID === change) {
    return { status: "CLOSED", change: cid };
  }

  for (let i = cid.length - 1; i >= 0; i--) {
    const currCurrency = cid[i][0];
    const currValue = currencies.get(currCurrency);
    let currAmount = cid[i][1];
    let numCurr = 0;

    while (change >= currValue && currAmount > 0) {
      change = Number((change - currValue).toFixed(2));
      currAmount = Number((currAmount - currValue).toFixed(2));
      numCurr += 1;
    }

    if (numCurr > 0) {
      changeArray.push([currCurrency, numCurr * currValue]);
    }
  }

  if (change > 0) {
    return { status: "INSUFFICIENT_FUNDS", change: [] };
  }

  return { status: "OPEN", change: changeArray };
}

console.log(
  checkCashRegister(19.5, 20, [
    ["PENNY", 1.01],
    ["NICKEL", 2.05],
    ["DIME", 3.1],
    ["QUARTER", 4.25],
    ["ONE", 90],
    ["FIVE", 55],
    ["TEN", 20],
    ["TWENTY", 60],
    ["ONE HUNDRED", 100],
  ])
);
