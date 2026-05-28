
public class Find_an_element_in_an_array {

    static int lin_ser(int[] arr, int tar) {
        for(int i=0;i< arr.length;i++){
            if(arr[i] == tar){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1, 13, 45, 66, 77};
        int res  = lin_ser(arr, 45);
        if(res != -1){
            System.out.print("Element found at index:"+res);
        }else{
            System.out.print("Element not present in array");
        }

    }
}
