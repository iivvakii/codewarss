
//https://www.codewars.com/kata/55b051fac50a3292a9000025/train/java
public class FilterNumber {
    public long filterString(final String value) {
        if(value.length() == 0){
            return 0;
        }
        String result = "";
        for(int i = 0; i < value.length(); i++){
            if(Character.isDigit(value.charAt(i))){
                result += value.charAt(i);

            }
        }
        return Long.parseLong(result); // complete this function :)
    }

}
