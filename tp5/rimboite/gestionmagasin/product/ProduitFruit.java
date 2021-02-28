package tp5.rimboite.gestionmagasin.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProduitFruit extends Product implements Critere{
    private String saison;
    private float quantite;

    public boolean estFrais(String saison){

        List<String> tmpList = Arrays.asList("Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Août", "Septembre", "Octobre", "Novembre", "Décembre");
        ArrayList<String> mois = new ArrayList<>();
        mois.addAll(tmpList);
        //get this saison index
        int index = mois.indexOf(this.saison);
        if (this.saison.equals("Décembr"))
            index = -1;
        if(this.saison.equals(saison) || mois.get(index + 1).equals(saison))
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

    public ProduitFruit(int id, String type, String libelle, float quantite, String saison,String marque) {
        super(id, libelle,type,marque);
        this.saison = saison;
        this.quantite = quantite;
    }

	public ProduitFruit() { 
	}
    
    
}
