/**
 * Classe Perimetre - Calcul de périmètre ((a + b) * c)
 * TODO: EXERCICE 3 - Implémenter la méthode perim()
 */
public class Perimetre {

    /**
     * TODO: Calculer le périmètre
     *
     * Formule: (a + b) * c
     * Utiliser Addition.add() et Produit.mult()
     *
     * @param a Premier côté
     * @param b Deuxième côté
     * @param c Facteur
     * @return (a + b) * c
     */
    public static int perim(int a, int b, int c) {
        int somme = Addition.add(a, b);
        return Produit.mult(somme, c);
    }
}
