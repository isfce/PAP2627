package tp00;

import java.util.Scanner;

public class TpToussaint {

	public static int compareDate(int j1, int m1, int a1, int j2, int m2, int a2) {
		assert 0 < j1 && j1 <= 31 && 0 < m1 && m1 <= 12 : "Date 1 non valide";
		assert 0 < j2 && j2 <= 31 && 0 < m2 && m2 <= 12 : "Date 2 non valide";
		int result = 0;
		if (a1 < a2)
			result = -1;
		else if (a1 > a2)
			result = 1;
		else if (m1 < m2)
			result = -1;
		else if (m1 > m2)
			result = 1;
		else if (j1 < j2)
			result = -1;
		else if (j1 > j2)
			result = 1;
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
