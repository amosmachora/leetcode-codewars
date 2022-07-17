import java.time.LocalTime;

public class HumanReadableTime {

    public static void main(String[] args) {
        System.out.println(makeReadable(1));
    }

    public static String makeReadable(int seconds) {

        double hours = Math.floor((double) seconds / 3600);
        double minutes = Math.floor((seconds - hours * 3600) / 60);
        double noOfSeconds = seconds - (hours * 3600 + minutes * 60);
        
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(String.format("%02d", (int) hours));
        stringBuilder.append(":");
        stringBuilder.append(String.format("%02d", (int) minutes));
        stringBuilder.append(":");
        stringBuilder.append(String.format("%02d", (int) noOfSeconds));

        return stringBuilder.toString();
    }

}
