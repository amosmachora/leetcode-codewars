public class CountingDuplicates {

    public static void main(String[] args) {
        System.out.println(duplicateCount("abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz"));
    }

    public static int duplicateCount(String text) {
        String textInLowerCase = text.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < textInLowerCase.length(); i++) {
            Character character = textInLowerCase.charAt(i);
            String subString = textInLowerCase.substring(i + 1);
            //+ 1 because I need the rest of the string excluding the character being checked.

            if (subString.contains(character.toString()) && !stringBuilder.toString().contains(character.toString())) {
                stringBuilder.append(character);
            }

        }
        return stringBuilder.length();
    }


}
