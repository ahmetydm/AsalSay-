import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("ilk sayı");
        double sayı1 = scan.nextDouble();
        Scanner scan2 = new Scanner(System.in);
        System.out.println("ikinci sayı");
        double sayı2 = scan2.nextDouble();
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Yapmak istediğiniz işlemi seçiniz");
        System.out.println("1-toplama \n2-çıkartma \n3-çarpma \n4-bölme ");
        int işlem = scan3.nextInt();


       if (işlem==1){
            System.out.println(sayı1+sayı2);
        }
        else if (işlem==2){
            System.out.println(sayı1-sayı2);
        }
        else if (işlem==3){
            System.out.println(sayı1*sayı2);
        }
        else if (işlem==4){
            System.out.println(sayı1/sayı2);
        }else {
           System.out.println("Geçersiz işlem");
       }
    }
}