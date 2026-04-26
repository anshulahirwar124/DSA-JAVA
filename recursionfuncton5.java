public class recursionfuncton5 {
    static int sumofdigitarray(int[]arr, int index){
        if(index == arr.length){
            return 0;
        }
        return arr[index] + sumofdigitarray(arr, index+1);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        System.out.println(sumofdigitarray(arr, 0));
    }
}
            