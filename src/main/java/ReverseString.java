public class ReverseString {


    public static void main(String[] args) {
        String original = "Cristiano Ronaldo";
        System.out.println(reverse(original));
    }

    public static String reverse(String original) {
        String reversed = "";
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            stringBuilder.append(original.charAt(i));
        }
        reversed = stringBuilder.toString();
        return reversed;
    }
}
