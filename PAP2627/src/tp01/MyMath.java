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

	public static void main(String[] args) {

		for (int i = 0; i < 31; i++)
			System.out.println(i + "!  ==> " + MyMath.fact(i));

	}

}
