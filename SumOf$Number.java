import java.util.Scanner;

public class SumOf$Number {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int Entries = ss.nextInt();
        int sum =0;
        for(int i =0; i<Entries;i++){
            Scanner sc= new Scanner(System.in);
            int num = sc.nextInt();
            sum =sum +num;
        }
        System.out.println("The sum of the 4 numbers is: "+sum);
    }
}
