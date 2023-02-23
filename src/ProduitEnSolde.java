public class ProduitEnSolde extends Produit {
    private double remise;

    public ProduitEnSolde(int code, double prix, double remise) {
        super(code, prix);
        setRemise(remise);
    }

    public double getRemise() {
        return remise;
    }

    public void setRemise(double remise) {
        if (remise < 0 || remise > 90) {
            throw new IllegalArgumentException("La remise doit être entre 0 et 90.");
        }
        this.remise = remise;
    }

    @Override
    public double prixProduit() {
        return getPrix() * (100 - remise) / 100;
    }

    @Override
    public String toString() {
        return super.toString() + ";" + remise;
    }
}
