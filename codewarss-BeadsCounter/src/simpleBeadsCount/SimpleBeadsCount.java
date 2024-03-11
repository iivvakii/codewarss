package simpleBeadsCount;

//https://www.codewars.com/kata/58712dfa5c538b6fc7000569/train/java
public class SimpleBeadsCount {
    public static int countRedBeads(final int nBlue) {
        if(nBlue < 2){
            return 0;
        }
        return (nBlue-1)*2;
    }
}