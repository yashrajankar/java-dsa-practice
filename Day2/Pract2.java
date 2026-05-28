import java.util.Scanner;
public class Pract2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row:");
        int row = sc.nextInt();
        System.out.println("Enter col:");
        int col = sc.nextInt();

        for(int i = 1; i<= row;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

/*

1
22
333
4444
55555

*/