function timeRequiredToBuy(tickets: number[], k: number): number {
  let time = 0;
  let i = 0;

  while (tickets.some((ticket) => ticket !== 0)) {
    const numberOfTicketsForPersonI = tickets[i];

    if (numberOfTicketsForPersonI > 0) {
      tickets[i]--;
      time++;
      if (i === k && tickets[i] === 0) {
        // Return time when person at position k finishes buying tickets
        return time;
      }
    }

    // Move to the next person
    i = (i + 1) % tickets.length;
  }

  return time; // Return total time taken
}
