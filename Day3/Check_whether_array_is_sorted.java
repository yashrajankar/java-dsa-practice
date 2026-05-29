public class Check_whether_array_is_sorted {
    static boolean isSorted(int[] arr){
        for(int i=1;i<arr.length;i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6};
        if(isSorted(arr)){
            System.out.println("Array is sorted");
        }else{
            System.out.println("Array is not sorted");
        }
    }
}
