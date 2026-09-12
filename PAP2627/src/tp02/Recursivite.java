package tp02;

public class Recursivite {
	/**
	 * Factorielle version récursive
	 * 
	 * @param n >=0
	 * @return
	 */
	public static long fact(int n) {
		assert n >= 0 : "n>=0!!";
		if (n <= 1)
			return 1;
		return n * fact(n - 1);
	}

	public static void main(String[] args) {

	}

}
