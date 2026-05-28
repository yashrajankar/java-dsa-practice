public class Find_first_negative_number{
    static int fir_neg(int[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i] < 0){
                return arr[i];
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int arr[] = {1,2,-3,4,5,-6};
        int res = fir_neg(arr);
        if(res != 0){
            System.out.print("First negativeElement present in the array is: "+res);
        }
    }
}