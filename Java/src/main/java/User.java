public class User {
    public static void main(String[] args) {
        User user = new User();
        user.setRank(-2);
        user.incProgress(1);
        System.out.println(user.progress);
//        System.out.println(1 > -1);
    }

    int rank = -8;

    int progress = 0;

    public User() {

    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRankProgress() {
        return progress;
    }

    public void setRankProgress(int progress) {
        this.progress = progress;
    }

    public void updateRank() {
        while (progress >= 100) {
            int newRank = this.rank + 1;
            if (rank == -1) {
                newRank = 1;
            } else if (rank == 8) {
                return;
            }
            setRank(newRank);
            setRankProgress(progress - 100);
        }
    }

    public void incProgress(int activityRank) {
        if (activityRank < -8 || activityRank == 0 || activityRank > 8) {
            throw new IllegalArgumentException();
        }

        System.out.println("Called with activity rank " + activityRank + " user rank " + getRank());
        if (activityRank == getRank()) {
            setRankProgress(progress + 3);
        } else if (getRank() > activityRank && getRank() - activityRank == 1) {
            setRankProgress(progress + 1);
        } else if (getRank() > activityRank && getRank() - activityRank >= 2) {
            return;
        } else if (activityRank > getRank()) {
            System.out.println("Called 5");
            int d;
            if (activityRank >= 0 && getRank() < 0) {
                d = (activityRank - getRank()) - 1;
            } else {
                d = activityRank - getRank();
            }

            int progress = 10 * d * d;
            setRankProgress(this.progress + progress);
        }
        updateRank();
    }

}
