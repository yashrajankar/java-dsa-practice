public class Find_average_of_array_elements{
    static int ave(int[] arr){
        int sum = 0;
        int average = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        average = sum/arr.length;
        return average;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int res = ave(arr);
        System.out.print("Average of sum of ele of array is "+res);
    }
}