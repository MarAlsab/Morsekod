package automation.alphabet;

public class ConvertAlphabet {
    private char[] alphabetArray = {'A','B'};
    private String alphabetString = "ABCD";
    public int convertFromCharToInt(char character) {
        // return alphabetString.indexOf(character)+1;
        for (int i= 0; i< alphabetArray.length;i++){
            if (alphabetArray[i] == character) return i+1 ;
        } return -1;
    }

    public char convertFromIntToChar(int i) {
        return alphabetString.charAt(i-1);
    }
}
