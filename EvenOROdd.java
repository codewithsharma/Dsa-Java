import java.util.Scanner;

public class EvenOROdd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num = (int)sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }

    }
}
