package alternateCase;

public class AlternateCase2 {
    static String alternateCase(final String string) {
        String result = "";
        for(int i = 0; i < string.length(); i++){
            if(Character.isUpperCase(string.charAt(i))){
                result += Character.toLowerCase(string.charAt(i));
            }
            else{
                result += Character.toUpperCase(string.charAt(i));
            }
        }
        return result;

    }
}
