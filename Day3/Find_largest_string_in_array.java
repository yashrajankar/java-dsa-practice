public class Find_largest_string_in_array {
    static String Lar_str(String[] str){
        String largest = str[0];
        for(int i=0;i<str.length;i++){
            if(str[i].length() > largest.length()){
                largest = str[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        String[] str = {"yash","Sarvadnya","Saad","sam"};
        System.out.println("Largest string is:"+Lar_str(str));
    }
}
