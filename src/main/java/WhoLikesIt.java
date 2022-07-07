public class WhoLikesIt {

    public static void main(String[] args) {
        System.out.println(whoLikedIt("Peter", "John", "Ken"));
    }

    public static String whoLikedIt(String... names) {
        switch (names.length) {
            case 0:
                return "no one likes this";
            case 1:
                return names[0] + " likes this";
            case 2:
                return names[0] + " and " + names[1] + " like this";
            case 3:
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            default:
                int extras = names.length - 2;
                return names[0] + ", " + names[1] + " and " + extras + " others like this";
        }

    }
}
