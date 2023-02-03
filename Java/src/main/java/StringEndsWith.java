public class StringEndsWith {

    public static boolean solution(String str, String ending) {
//        Check if the second string exists in the first
//        Get the length of the second string
//        Get the substring of the first using the last index.

        int lengthOfSecondString = ending.length();
        int lengthOfFirstString = str.length();

        if(lengthOfSecondString > lengthOfFirstString){
            return false;
        }else {
            String endingOfFirstString = str.substring(lengthOfFirstString-lengthOfSecondString);

            if(endingOfFirstString.equals(ending)){
                return true;
            }else{
                return false;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(StringEndsWith.solution("abc\n","abc"));
    }
}
