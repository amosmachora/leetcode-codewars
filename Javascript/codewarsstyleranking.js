class User {
  progress = 0;
  static possibleRanks = [];
  stage = 0;
  rank = -8;

  constructor() {
    this.possibleRanks = [
      -8, -7, -6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5, 6, 7, 8,
    ];
  }

  incProgress(activityRank) {
    if (activityRank > 8 || activityRank < -8 || activityRank === 0) {
      throw new Error();
    }
    if (this.rank === 8) {
      return;
    }

    let points = 0;

    if (activityRank === this.rank) {
      points = 3;
    } else if (activityRank === this.rank - 1) {
      points = 1;
    } else if (activityRank > this.rank) {
      let d = Math.abs(activityRank - this.rank);
      points = 10 * d * d;
    } else {
      points = 0;
    }

    this.progress += points;

    console.log(
      "Before rank change:",
      activityRank,
      this.rank,
      this.stage,
      this.progress
    );

    while (this.progress >= 100 && this.rank !== 8) {
      this.progress -= 100;
      this.stage++;
      this.rank = this.possibleRanks[this.stage];

      console.log(
        "Rank changed:",
        activityRank,
        this.rank,
        this.stage,
        this.progress
      );
    }

    console.log(
      "After rank change:",
      activityRank,
      this.rank,
      this.stage,
      this.progress
    );
  }
}

const user = new User();
user.rank; // => -8
user.progress; // => 0
user.incProgress(-7);
user.progress; // => 10
user.incProgress(-5); // will add 90 progress
// user.progress # => 0 // progress is now zero
// user.rank # => -7 // rank was upgraded to -7
console.log(user.rank); // -8
