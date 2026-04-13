public class reverserecursion2 {
    static void reverse(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        reverse(n-1);
    }
    public static void main(String[] args) {
        int n = 5;
        reverse(n);
    }
}

