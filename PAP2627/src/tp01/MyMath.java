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

	public static void main(String[] args) {

		for (int i = 0; i < 31; i++)
			System.out.println(i + "!  ==> " + MyMath.fact(i));

	}

}
