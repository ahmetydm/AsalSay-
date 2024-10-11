import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int asal = scan.nextInt();
        int sum = 0;
        for (int i=2; i<asal; i++){
            if (asal%i==0){
                sum++;
            }
        }
        if (sum==0){
            System.out.println(asal+" Asaldır");
        }else{
            System.out.println(asal+" Asal değildir");
        }
    }
}