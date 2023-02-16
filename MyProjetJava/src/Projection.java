public class Projection implements CineInfo {

    private int idCinema;
    private int idFilm;
    private String jour;

    public Projection(int idCinema, int idFilm, String jour) {
        this.idCinema = idCinema;
        this.idFilm = idFilm;
        this.jour = jour;
    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }

    public int getIdFilm() {
        return idFilm;
    }

    public void setIdFilm(int idFilm) {
        this.idFilm = idFilm;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }
    public String toString(){
        return "la projection du film " +  this.idFilm + " a lieu dans la cinema " + this.idCinema+ " le jour"+  this.jour;
    }
    @Override
    public void afficheInfo() {
        String s = "la projection du film " +  this.idFilm + " a lieu dans la cinema " + this.idCinema+ " le jour"+  this.jour;
        System.out.println(s);
    }



}
