import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Number = sc.nextInt();
        for(int i = 0;i<Number;i++){
            if((Number-i)%2==0){
                System.out.println("Not a Prime Number");
            }
           
            else{
                System.out.println("Prime Number");
            }
            
        };
    }
}
