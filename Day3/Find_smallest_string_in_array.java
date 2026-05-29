public class Find_smallest_string_in_array {
    static String smallStr(String[] str){
        String smallest = str[0];
        for(int i=0;i<str.length;i++){
            if(str[i].length() < smallest.length()){
                smallest = str[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args){
        String[] str = {"yash","Sarvadnya","Saad","sam"};
        System.out.println("Largest string is:"+smallStr(str));
    }
}
