import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre the digit : ");
         int n = sc.nextInt();
        int numDigit =0;

        while( n>0){
            n = n/10;
//            System.out.println(n);
            numDigit++;
        }
            System.out.println("Totol Digit is: " +numDigit);
    }
}
