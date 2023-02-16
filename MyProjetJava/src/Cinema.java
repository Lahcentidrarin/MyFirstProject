public class Cinema extends Entreprise implements CineInfo {
    private int idCinema;
    public Cinema(int idCinema, String nom, String adresse) {
        super(nom, adresse);
        this.idCinema=idCinema;
    }

    public int getIdCinema() {
        return idCinema;
    }

    public void setIdCinema(int idCinema) {
        this.idCinema = idCinema;
    }
    public String toString(){
        return "Cinema " +  this.idCinema + " s'applle " + super.getNom()+ " et situe à "+  super.getAdresse();
    }
    @Override
    public void afficheInfo() {
        String s = "Cinema " +  this.idCinema + " s'applle " + super.getNom()+ " et situe à"+  super.getAdresse();
        System.out.println(s);
    }

}
