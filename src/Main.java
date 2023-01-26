import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double kilo,boy,sonuc;
        System.out.print("Boyunuzu Giriniz: ");
        boy=input.nextDouble();
        System.out.print("Kilonuzu Giriniz: ");
        kilo=input.nextDouble();
        sonuc= kilo/(boy*boy);
        System.out.println("Vücut Kütle Endeksiniz: "+sonuc);
    }
}