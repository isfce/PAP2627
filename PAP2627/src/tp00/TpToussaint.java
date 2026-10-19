package tp00;

import java.util.Scanner;

public class TpToussaint {

	public static int compareDate(int j1, int m1, int a1, int j2, int m2, int a2) {
		int result = 0;

		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		//Date1
		System.out.print("Entrez le jour de la date1: ");
		int j1 = scan.nextInt();
		System.out.print("Entrez le mois de la date1: ");
		int m1 = scan.nextInt();
		System.out.print("Entrez l'année de la date1: ");
		int a1 = scan.nextInt();
		//Date2
		System.out.print("Entrez le jour de la date2: ");
		int j2 = scan.nextInt();
		System.out.print("Entrez le mois de la date2: ");
		int m2 = scan.nextInt();
		System.out.print("Entrez l'année de la date2: ");
		int a2 = scan.nextInt();
		int result = TpToussaint.compareDate(j1, m1, a1, j2, m2, a2);
		System.out.println(result);

		scan.close();

	}
};
