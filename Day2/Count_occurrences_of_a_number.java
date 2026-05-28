public class Count_occurrences_of_a_number{
    static int count_occ(int[] arr,int tar){
        int count = 0;
        for(int i = 0;i< arr.length;i++){
            if(arr[i] == tar){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        int arr[] = {2,2,3,5,6,2,9,3};
        int tar = 2;
        int res = count_occ(arr,tar);
        System.out.println("Element "+tar+" occurs "+res+" times in the array");
    }
}