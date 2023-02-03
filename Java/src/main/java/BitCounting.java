public class BitCounting {
    public static void main(String[] args) {
        System.out.println(countBits(4));
    }

    public static int countBits(int n) {
        String binaryString = Integer.toBinaryString(n);

        int numberOfOnes = 0;

        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                numberOfOnes++;
            }
        }
        return numberOfOnes;
    }
}
