package reverseAText;

import java.util.Arrays;

public class ReverseAText {
    public static void main(String[] args) {
        //Yazilan metni ters cevirerek konsola yazan bir java kodu yaziniz...
        String yazi = "Java cok guzel";
        String tersYazi = "";

        String[] harfler = yazi.split("");
        System.out.println("Arrays.toString(harfler) = " + Arrays.toString(harfler));

        for (int i = harfler.length - 1; i >= 0; i--) {
            tersYazi += harfler[i]; //lezug koc avaJ  //lezug koc avaJ
        }
        System.out.println("Yazimizin tersten yazilisi = " + tersYazi);
    }
}