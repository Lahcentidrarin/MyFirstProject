public class Jouer {
    private int idActeur;
    private int idFilm;
    private String role;

    public Jouer(){}

    public Jouer(int idActeur, int idFilm, String role) {
        this.idActeur = idActeur;
        this.idFilm = idFilm;
        this.role = role;
    }

    public int getIdActeur() {
        return idActeur;
    }

    public void setIdActeur(int idActeur) {
        this.idActeur = idActeur;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public String toString(){
        return "l'acteur " +  this.idActeur + " a joue dans le film" +this.idFilm+ " en tant que"+ this.role;
    }


}
