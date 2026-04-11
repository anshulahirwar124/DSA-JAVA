public class string5 {
    public static void main(String[] args){
        String str1="abc";
        char remove = 'b';
        String result = "";
        for(int i=0; i<str1.length(); i++){
            if(str1.charAt(i) != remove){
                result = result + str1.charAt(i);
            }
        }        System.out.println(result);
    }
}        