import java.io.*;
import java.util.*;

public class Boutique {
    private List<Produit> produits = new ArrayList<>();

    public int indiceDe(int code) {
        for (int i = 0; i < produits.size(); i++) {
            if (produits.get(i).getCode() == code) {
                return i;
            }
        }
        return -1;
    }

    public void ajouter(Produit p) {
        if (produits.contains(p)) {
            throw new IllegalArgumentException("Le produit existe déjà dans la boutique.");
        }
        produits.add(p);
    }

    public boolean supprimer(int code) {
        int index = indiceDe(code);
        if (index != -1) {
            produits.remove(index);
            return true;
        }
        return false;
    }

    public boolean supprimer(Produit p) {
        return produits.remove(p);
    }

    public int nombreProduitsEnSolde() {
        int count = 0;
        for (Produit p : produits) {
            if (p instanceof ProduitEnSolde) {
                count++;
            }
        }
        return count;
    }

    public void enregistrer(String chemin) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(chemin))) {
            for (Produit p : produits) {
                writer.println(p.getClass().getSimpleName() + ";" + p);
            }
        }
    }
}
