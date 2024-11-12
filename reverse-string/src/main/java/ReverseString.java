class ReverseString {

    String reverse(String inputString) {
        //Formato con For
        /*String reversed = "";

        for(int i = inputString.length() -1 ; i>=0; i--){
            reversed += inputString.charAt(i);
        }
        return reversed;*/

        //Formato con StringBuilder
        StringBuilder sb = new StringBuilder(inputString);

        return sb.reverse().toString();
    }
  
}
