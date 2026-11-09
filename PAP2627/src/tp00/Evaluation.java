package tp00;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Evaluation {

	/**
	 * Calcule la décision d'une note
	 * 
	 * @param note doit être entre 0 et 100
	 * @return la décision
	 */
	public static String calculDecision(Integer note) {
		assert note >= 0 && note <= 100 : "La note doit être entre 0 et 100";
		String decision = switch (note) {
		case Integer a when a < 30 -> "Refus";
		case Integer a when a < 50 -> "Ajourné";
		default -> "Réussite";
		};
		return decision;
	}

	String doubleToRating(Double rating) {
		return switch (rating) {
		case Double d when d == 0 -> "0 stars";
		case Double d when d > 0d && d < 2.5d -> d + " is not good";
		case Double d when d >= 2.5f && d < 5d -> d + " is better";
		default -> "Invalid rating";
		};
	}

	/**
	 * Lancement des exemples
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean erreur = true;
		int note = 0;
		while (erreur) {
			try {
				System.out.print("Entrez un nombre entre 0 et 100: ");
				note = scan.nextInt();
				erreur = note < 0 || note > 100;
				if (erreur)
					System.err.println("La note doit être entre 0 et 100!");

			} catch (InputMismatchException exc) {
				System.err.println("La note doit être un nombre!");
				scan.next();
			}
		}
		// Traitement
		String decision = calculDecision(note);

		// Output
		System.out.println("La note de " + note + "  a comme décision: " + decision);

		scan.close();
	}

}
