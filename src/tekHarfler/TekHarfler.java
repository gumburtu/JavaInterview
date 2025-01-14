package tekHarfler;

import java.util.Arrays;

public class TekHarfler {
    public static void main(String[] args) {
        String ad = "sevalaslan";
        String tekHarfler = "";
        
        String[] adDizi = ad.split("");
        System.out.println("Arrays.toString(adDizi) = " + Arrays.toString(adDizi));

        for (int i = 0; i < adDizi.length; i++) {
            char currentChar = ad.charAt(i);
            if (ad.indexOf(currentChar) == ad.lastIndexOf(currentChar)){
                tekHarfler += currentChar;
            }
        }
        System.out.println("Tek harfler = " + tekHarfler);
    }
}
