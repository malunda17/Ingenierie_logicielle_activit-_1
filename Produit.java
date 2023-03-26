/**
 * Ecriture de la clase Produit
 *
 * @author Dahn
 */
package c306activite1;

import java.util.Objects;

/**
 * Classe Produit représentant un produit avec un prix et une référence.
 */
public class Produit {

    /**
     * représente la reference du produit.
     */
    private final String reference;
    /**
     * représente la reference du produit.
     */
    private double prix;

    /**
     * @param reference constructeur
     */
    public Produit(final String reference) {
        this.reference = reference;
    }

    /**
     * @return le prix
     */
    public double getPrix() {
        return this.prix;
    }

    /**
     * @param prix modifie le prix
     */
    public final void setPrix(final Double prix) {
        this.prix = prix;
    }

    /**
     * @return la reference si le prix est positif, null sinon
     */
    public final String getReference() {
        if (prix < 0) {
            return null;
        } else {
            return reference;
        }
    }

    /**
     * @param o
     * @return la comparaison de deux objets par leur reference
     */
    @Override
    public boolean equals(final Object o) {
        return reference.equals(((Produit) o).reference);
    }

    @Override
    public final int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.reference);
        return hash;
    }
}
