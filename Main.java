import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int prime = scan.nextInt();
        int sum = 0;
        for (int i=2; i<prime; i++){
            if (prime%i==0){
                sum++;
            }
        }
        if (sum==0){
            System.out.println(prime+" Asaldır");
        }else{
            System.out.println(prime+" Asal değildir");
        }
    }
}