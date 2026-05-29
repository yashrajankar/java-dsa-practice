public class Reverse_traverse_an_array {
    static int Rev_arr(int[] arr){
        for(int i=arr.length - 1;i >= 0;i--){
            System.out.print(arr[i]+" ");
        }
        return 0;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Rev_arr(arr);
    }
}
