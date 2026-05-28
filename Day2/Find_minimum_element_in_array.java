public class Find_minimum_element_in_array{
    static int min_Sear(int[] arr){
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        int arr[] = {42,52,23,2,64};
        int res = min_Sear(arr);
        System.out.print("Smallest element present in array is "+res);
    }
}