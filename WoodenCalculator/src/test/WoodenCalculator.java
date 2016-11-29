package test;

import java.util.Scanner;

public class WoodenCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double arvo1 = 0;
		double arvo2 = 0;
		double summa = 0;
		double erotus = 0;
		double kerto = 0;
		double jako = 0;
		String valinta = "";
		boolean lopeta = false;

		while (lopeta == false) {

			System.out.print("anna arvo: ");
			arvo1 = scan.nextDouble();
			scan.nextLine();
			System.out.print("anna toinen arvo: ");
			arvo2 = scan.nextDouble();
			scan.nextLine();
			System.out.print("Valinta (+,-,*,/) 1=lopetus:");
			valinta = scan.nextLine();
			switch (valinta) {
			case "+":
				summa = arvo1 + arvo2;
				System.out.println("Summa: " + summa);
				break;
			case "-":
				erotus = arvo1 - arvo2;
				System.out.println("Erotus: " + erotus);
				break;
			case "*":
				kerto = arvo1 * arvo2;
				System.out.println("Kerto: " + kerto);
				break;
			case "/":
				jako = arvo1 / arvo2;
				System.out.println("Jako: " + jako);
				break;
			case "1":
				lopeta = true;
				break;
			default:
				System.out.println("Virheellinen syöttö!");

				break;
			}

		}

	}

}
