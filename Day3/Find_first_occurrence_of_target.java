public class Find_first_occurrence_of_target{
    static int first_occur(int[] arr,int tar){
        for(int i=1;i< arr.length;i++){
            if(arr[i] == tar){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {1,2,4,4,3,6,3};
        int tar = 3;
        int res = first_occur(arr,tar);
        System.out.println("Element first occur at index:"+res);
    }
}