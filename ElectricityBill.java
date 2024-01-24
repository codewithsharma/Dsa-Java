import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        int Charges =0 ;
        if(units>=1 && units<100 ){
            System.out.println("Free");
        }
        else if(units>=101 && units<=200 ){
            Charges= ((units-100)*5);
         
        }
        else if(units>=201 && units<300 ){
            Charges= (100*5 +(units-200)*10);
           
        }
        else{
            Charges= (100*10 + 100*5 +(units-300)*12);
         
        }
         System.out.println(Charges);

    }
}
