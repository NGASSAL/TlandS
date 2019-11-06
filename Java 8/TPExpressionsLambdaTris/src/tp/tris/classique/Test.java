package tp.tris.classique;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) throws EmployeException {
		Entreprise e1 = new Entreprise("IBM");
		e1.ajouter(new Employe("Dupond", 5000));
		e1.ajouter(new Employe("Poiret", 6000));
		e1.ajouter(new Employe("Burot", 5700));
		e1.ajouter(new Employe("Pernaut", 4300));
		System.out.println(e1);

		// Remplit une liste avec les employ�s
		List<Employe> l = new ArrayList<Employe>();
		for (Employe e : e1) {
			l.add(e);
		}

		// Tri par salaires croissants
		CompareSalaire comparateur = new CompareSalaire();
		Collections.sort(l, comparateur);
		System.out.println("Employ�s de " + e1.getNom() + " par ordre croissant des salaires");
		for (Employe employe : l) {
			System.out.println(employe.getNom() + " gagne " + employe.getSalaire());
		}
	}
}