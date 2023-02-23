public class Produit {
    private int code;
    private double prix;

    public Produit(int code, double prix) {
        this.code = code;
        this.prix = prix;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public double prixProduit() {
        return prix;
    }

    @Override
    public String toString() {
        return code + ";" + prix;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Produit other = (Produit) obj;
        return code == other.code;
    }
}
