package tp5.rimboite.gestionmagasin.employee;

public class Employee {
    private int id;
    private String nom;
    private String address;
    private int nbr_heures;



    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNbr_heures() {
        return nbr_heures;
    }

    public void setNbr_heures(int nbr_heures) {
        this.nbr_heures = nbr_heures;
    }

    public String toString() {
        return "Employee [address=" + address + ", id=" + id + ", nbr_heures=" + nbr_heures + ", nom=" + nom + "]";
    }

    // public Employee(int id, String nom, String address, float nbr_heures) {
    //     this.id = id;
    //     this.nom = nom;
    //     this.address = address;
    //     this.nbr_heures = nbr_heures;
    // }


    private String salaire(){
        return null;
    }
    
}



