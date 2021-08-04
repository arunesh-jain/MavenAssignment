public class StringFunctions {
    String reverseString(String str){
        String revString="";
        for(int i=str.length()-1;i>=0;i--) {
            revString = revString + String.valueOf(str.charAt(i));
        }
        return revString;
    }

    int lengthOfString(String str){

        return str.length();
    }
}