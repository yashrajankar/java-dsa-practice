public class Search_a_character_in_a_string {
    static int char_lin_sear(String str,int tar){
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == tar){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        String name = "yash";
        char target = 'a';
        int res = char_lin_sear(name,target);
        if(res != -1){
            System.out.print("Char present at index:"+res);
        }else{
            System.out.print("Char is not present the String");
        }
    }
}
