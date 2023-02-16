public class Personne {
    private int idPersonne;
    private String nom ;
    private String prenom ;

    public Personne(){}

    public Personne(int idPersonne, String nom, String prenom) {
        this.idPersonne = idPersonne;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getIdPersonne() {
        return idPersonne;
    }

    public void setIdPersonne(int idPersonne) {
        this.idPersonne = idPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String toString(){
        return "la personne " + this.idPersonne + "s'appelle "+ this.nom + " " + this.prenom  ;
    }


}
