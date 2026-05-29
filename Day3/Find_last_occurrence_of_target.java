public class Find_last_occurrence_of_target{
    static int first_occur(int[] arr,int tar){
        for(int i=arr.length - 1;i >= 0;i--){
            if(arr[i] == tar){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,3,6,1};
        int tar = 3;
        int res = first_occur(arr,tar);
        System.out.println("Element last occur at index:"+res);
    }
}
