public class string3 {
    public static void main(String[] args){
        String str1 = "Madam";
        String rev = "";
        for(int i=str1.length()-1; i>=0; i--){
            rev = rev + str1.charAt(i);
        }
        System.out.println(rev);
        if (str1.equals(rev)) 
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}