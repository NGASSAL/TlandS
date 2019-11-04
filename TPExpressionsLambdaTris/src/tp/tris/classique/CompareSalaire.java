package tp.tris.classique;
import java.util.Comparator;

/**
 * Comparateur d'employ�s. Utilise le salaire pour
 * comparer 2 employ�s.
 */
public class CompareSalaire implements Comparator<Employe> {

  /**
   * Compare 2 employ�s suivant leur salaire.
   * @return un nombre positif si le salaire de e1 est sup�rieur au
   * salaire de e2, 0 si les 2 salaires sont les m�mes, et n�gatif sinon.
   */
  public int compare(Employe e1, Employe e2) {
    return Double.compare(e1.getSalaire(), e2.getSalaire());
  }
}