import java.awt.*;

public class HexToRGB {

    public static int[] hexStringToRGB(String hex) {
        var color = Color.decode(hex);
        return new int[]{color.getRed(), color.getGreen(), color.getBlue()};
    }

}