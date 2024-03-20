import java.util.Scanner;

public class ödev {
    public static void main(String[] args) {
        String[] ozne = {"Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrezzak", "Şehribanu", "Zeynelabidin", "Naki"};
        String[] nesne = {"Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma",
                "Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı"};
        String[] yuklem = {"Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("cumle giriniz:");
        String cumle = scanner.nextLine().trim();

        String[] kelimeler = cumle.split("\\s+");
        if (kelimeler.length == 3 && contains(ozne, kelimeler[0]) && contains(nesne, kelimeler[1]) && contains(yuklem, kelimeler[2])) {
            System.out.println("EVET");
        } else {
            System.out.println("HAYIR");
        }
    }

   public static boolean contains(String[] array, String eleman) {
    int index = 0;
    while (index < array.length) {
        if (array[index].equals(eleman)) {
            return true;
        }
        index++;
    }
    return false;
}
}
