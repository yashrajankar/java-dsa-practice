public class Find_all_occurrence_of_target {
    static int all_occur(int[] arr,int tar){
        for(int i=1;i<arr.length;i++){
            if(arr[i] == tar){
                System.out.println(i+" ");
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int arr[] = {1,2,3,3,4,4,3,8};
        int tar = 4;
        all_occur(arr,tar);

    }
}
