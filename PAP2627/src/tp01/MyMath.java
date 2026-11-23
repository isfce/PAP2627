package tp01;

public class MyMath {

	public static long fact(int n) {
		assert n >= 0 && n < 21 : "n doit être positif";
		long res = 1;
		for (int i = 2; i <= n; i++)
			res = res * i;
		return res;
	}

	public static long fact2(int n) {
		assert n >= 0 && n < 21 : "n doit être positif";
		long res = 1;
		for (; n > 1; n--)
			res = res * n;
		return res;
	}

	/**
	 * Calcule la somme de n à m  (n<=m)
	 * @param n
	 * @param m
	 * @return
	 */
	public static long calculSomme(int n, int m) {
		assert n <= m : "n doit être <= à m";

		if (n < 0 && m > 0) {
			if (-n == m)
				return 0;
			if (-n > m)
				m = -m - 1;
			else
				n = -n + 1;
		}

		long s = n;
		for (int i = n + 1; i <= m; i++)
			s = s + i;

		return s;
	}

	/**
	 *  Calcule le Fn de la suite de Fibonacci
	 * @param n
	 * @return
	 */
	public static int fibo(int n) {
		assert n >= 0 : " n doit être positif";
		if (n < 2)
			return n;
		int f0 = 0;
		int f1 = 1;
		int f2;
		for (int i = 2; i <= n; i++) {
			f2 = f1 + f0;
			f0 = f1;
			f1 = f2;
		}
		return f1;
	}

	/**
	 * nombre d'itérations pour obtenir la précision epsilon du nombre d'or
	 * à partir de Fibonacci
	 * @param eps  Doit être > 0
	 * @return
	 */
	public static int nombreOr(double eps) {
		assert eps > 0 : "eps doit être >0";
		eps = Math.abs(eps);//au cas où l'assert n'est pas activée
		double phi = (1.0 + Math.sqrt(5)) / 2.0;
		int f0 = 1;
		int f1 = 1;
		int n = 1;
		int f2;
		while (Math.abs(phi - (double) f1 / f0) > eps) {
			f2 = f1 + f0;
			f0 = f1;
			f1 = f2;
			n++;
		}
		return n;
	}

	/**
	 * Vérifie si un nombre est un nombre premier
	 * @param n   >=2
	 * @return
	 */
	public static boolean estPremier(int n) {
		assert n >= 2 : " n doit être  >=2";
		boolean premier = n == 2 || n % 2 != 0;
		int d = 3;
		while (premier && d * d <= n) {
			premier = n % d != 0;
			d = d + 2;
		}
		return premier;
	}

	public static void main(String[] args) {

		/*	for (int i = 0; i < 31; i++)
				System.out.println(i + "!  ==> " + MyMath.fact(i));
		*/
		System.out.println(nombreOr(-0.01));
	}

}
