package oddEvenSort;

public class OddEvenSort {
    public static String sortMyString(String s) {
        String res = "";

        for(int i = 0; i < s.length(); i += 2){
            res += s.charAt(i);
        }
        res += " ";
        for(int i = 1; i < s.length(); i += 2){
            res += s.charAt(i);
        }
        return res;
    }
}
