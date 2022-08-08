import java.util.Scanner;

public class kdvhesaplama {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen urunun fiyatini giriniz: ");
        int fiyat = scan.nextInt();

        float kdvli = (float) (fiyat + fiyat * 0.18);
        float kdv = (float) (fiyat * 0.18);

        System.out.println("KDV'siz Fiyat: " + fiyat);
        System.out.println("KDV'li Fiyat: " + kdvli);
        System.out.println("KDV tutari: " + kdv);

    }
}
