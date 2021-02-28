package tp5.rimboite.gestionmagasin.product;

public class ProduitLegume extends Product implements Critere{
    private String saison;
    private float quantite;
        
    public boolean estFrais(String saison){
        if(this.saison.equals(saison))
            return true;
        return false;
    }

    @Override
    public String afficher(){
        return super.afficher() + " " + this.saison + " " + this.quantite;
    }

    public String getSaison() {
        return saison;
    }

    public void setSaison(String saison) {
        this.saison = saison;
    }

    public float getQuantite() {
        return quantite;
    }

    public void setQuantite(float quantite) {
        this.quantite = quantite;
    }

    public ProduitLegume(int id, String type, String libelle, float quantite, String saison) {
        super(id, libelle,type);
        this.saison = saison;
        this.quantite = quantite;
    }   
}