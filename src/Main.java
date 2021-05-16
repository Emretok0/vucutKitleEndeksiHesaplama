import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
		double boy = input.nextDouble();

		System.out.print("Lütfen kilonuzu giriniz: ");
		double kilo = input.nextDouble();

		double kitleEn = kilo/(boy*boy);
		System.out.println(kitleEn);
    }
}
