import java.util.Scanner;
public class Yeniiiiii {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz : ");
        int n=inp.nextInt();
        int basDeger;
        int total=0;
        while(n>0){
            basDeger=n%10;
            n/=10;
            total+=basDeger;
            basDeger=0;
        }
        System.out.println("Toplam: "+total);


    }

}
