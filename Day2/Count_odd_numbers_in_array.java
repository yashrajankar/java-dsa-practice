public class Count_odd_numbers_in_array{
    static int count_odd(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7,8,9,13};
        int res = count_odd(arr);
        System.out.print("Count of odd no.s :"+res);
    }
}