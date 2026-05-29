public class Find_maximum_element_in_array {
    static int max_ele(int[] arr){
        int max = arr[0];
        for(int i =0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr = {12,34,56,81,90};
        int res = max_ele(arr);
        System.out.println("Maximum element is:"+res);
    }
}
