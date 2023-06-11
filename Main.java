import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Doğduğunuz Ayı Giriniz : ");
        String ay = input.nextLine().toLowerCase();

        System.out.print("Doğduğunuz Günü Giriniz : ");
        int gun = input.nextInt();

        String burc = "";

        if ((ay.equals("ocak") || ay.equals("1")) && gun >= 22 || (ay.equals("şubat") || ay.equals("2")) && gun <= 18) {
            burc = "Kova";
        } else if ((ay.equals("şubat") || ay.equals("2")) && gun >= 19 || (ay.equals("mart") || ay.equals("3")) && gun <= 20) {
            burc = "Balık";
        } else if ((ay.equals("mart") || ay.equals("3")) && gun >= 21 || (ay.equals("nisan") || ay.equals("4")) && gun <= 20) {
            burc = "Koç";
        } else if ((ay.equals("nisan") || ay.equals("4")) && gun >= 21 || (ay.equals("mayıs") || ay.equals("5")) && gun <= 21) {
            burc = "Boğa";
        } else if ((ay.equals("mayıs") || ay.equals("5")) && gun >= 22 || (ay.equals("haziran") || ay.equals("6")) && gun <= 22) {
            burc = "İkizler";
        } else if ((ay.equals("haziran") || ay.equals("6")) && gun >= 23 || (ay.equals("temmuz") || ay.equals("7")) && gun <= 22) {
            burc = "Yengeç";
        } else if ((ay.equals("temmuz") || ay.equals("7")) && gun >= 23 || (ay.equals("ağustos") || ay.equals("8")) && gun <= 22) {
            burc = "Aslan";
        } else if ((ay.equals("ağustos") || ay.equals("8")) && gun >= 23 || (ay.equals("eylül") || ay.equals("9")) && gun <= 22) {
            burc = "Başak";
        } else if ((ay.equals("eylül") || ay.equals("9")) && gun >= 23 || (ay.equals("ekim") || ay.equals("10")) && gun <= 22) {
            burc = "Terazi";
        } else if ((ay.equals("ekim") || ay.equals("10")) && gun >= 23 || (ay.equals("kasım") || ay.equals("11")) && gun <= 21) {
            burc = "Akrep";
        } else if ((ay.equals("kasım") || ay.equals("11")) && gun >= 22 || (ay.equals("aralık") || ay.equals("12")) && gun <= 21) {
            burc = "Yay";
        } else if ((ay.equals("aralık") || ay.equals("12")) && gun >= 22 || (ay.equals("ocak") || ay.equals("1")) && gun <= 21) {
            burc = "Oğlak";
        } else {
            System.out.println("Geçersiz tarih!");
            System.exit(0);

        }

        System.out.println("Burcunuz: " + burc);


        input.close();
    }
}
