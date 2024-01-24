import java.util.Scanner;

public class MaxNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =sc.nextInt();
        int maxOfThreeNumbers;
    if((a>=b)&&(a>=c)){
        maxOfThreeNumbers=a;
        System.out.println("Maximum number is: " + maxOfThreeNumbers);   
    }
    else if ((b>=a) && (b >= c)) {
        maxOfThreeNumbers=b;
        System.out.println("Maximum number is: " + maxOfThreeNumbers);
    }
    else{
        maxOfThreeNumbers=c;
        System.out.println("Maximum number is: " + maxOfThreeNumbers);
    }
    }

}
