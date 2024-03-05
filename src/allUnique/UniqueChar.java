package allUnique;
import java.util.Arrays;

//https://www.codewars.com/kata/553e8b195b853c6db4000048/solutions/java?filter=me&sort=best_practice&invalids=false
public class UniqueChar {
    public boolean hasUniqueChars(String str) {
        if(str.length() < 2){
            return true;
        }
        char[] charStr = str.toCharArray();
        Arrays.sort(charStr);
        String s = new String(charStr);
        for(int i = 0, j = 1; i < s.length(); i++, j++){
            if (j < s.length()){
                if(i < s.length() && s.charAt(i) == s.charAt(j)){
                    return false;
                }
            }

        }
        return true;
    }
}
