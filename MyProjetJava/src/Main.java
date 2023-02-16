import java.sql.Connection;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //jE SUIS LAHCEN

        // Question8 9 15
        ArrayList<Personne>   listPerso= new ArrayList<>();
        Personne P1 = new Personne(1,"hublot", "camille");
        Personne P2 = new Personne(2,"Aaloui", "ahmed");
        listPerso.add(P1);
        listPerso.add(P2);
        for (Personne p: listPerso){
            System.out.println(p);
        }
/*
        // Question10 11
        ArrayList<Film>   listFilm= new ArrayList<>();
        Film F1= new Film(1,1,"Avatar","Science fiction", 2012);
        Film F2= new Film(1,1,"eternals","Science fiction", 2022);
        listFilm.add(F1);
        listFilm.add(F2);

        // Question12 13
        ArrayList<Cinema>   listeCinema= new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez les informations de la premiere cinéma :");
        System.out.print("ID : ");
        int id1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nom : ");
        String nom1 = scanner.nextLine();
        System.out.print("Adresse : ");
        String adresse1 = scanner.nextLine();
        Cinema cinema1 = new Cinema(id1,nom1, adresse1);


        System.out.println("Entrez les informations de la deuxième cinéma :");
        System.out.print("ID : ");
        int id2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nom : ");
        String nom2 = scanner.nextLine();
        System.out.print("Adresse : ");
        String adresse2 = scanner.nextLine();


        Cinema cinema2 = new Cinema(id2 , nom2, adresse2);

        // Question14
        listeCinema.add(cinema1);
        listeCinema.add(cinema2);

        // Question16
        for (Cinema c: listeCinema){
            System.out.println(c.afficheInfo());
        }

*/
        // Question17
        try {
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/cinebase","root", "");

            // Question18
            //Statement stat =c.createStatement();
            // Question19
            String Q1= " Select * from personne where nom like 'S%'";
            // Question20
            String Q2= " Select titre from film where titre like '%blanc%'";

            //ResultSet resultSet = stat.executeQuery(Q2);
            //while (resultSet.next()) {
            //    System.out.println(resultSet.getString("titre"));}

            // Question21
            /*for (Cinema cinema : listeCinema) {
                String Q3 = "INSERT INTO Cinema (idCinema, nom, adresse) VALUES (?, ?, ?)";

                PreparedStatement ps = c.prepareStatement(Q3);
                ps.setInt(1, cinema.getIdCinema());
                ps.setString(2, cinema.getNom());
                ps.setString(3, cinema.getAdresse());

                int q1 =ps.executeUpdate();
                System.out.println(q1);
            }

            // Question22
            Scanner scanner = new Scanner(System.in);
            String Q4= " Update Cinema SET nom = ? WHERE idCinema = ? ";
            PreparedStatement pss = c.prepareStatement(Q4);
            System.out.println("Entrez id de la cinema :");
            int idCine = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Nouveau Nom : ");
            String NVnom = scanner.nextLine();
            pss.setString(1, NVnom);
            pss.setInt(2, idCine);
            int q2 = pss.executeUpdate();
            System.out.println(q2);
*/
            // Question23
            String Q5= " Delete FROM projection  WHERE idFilm = 3 ";
            PreparedStatement psss = c.prepareStatement(Q5);
            int q3 =psss.executeUpdate();
            System.out.println(q3);





        }catch (SQLException e) {throw new RuntimeException(e);}





    }
}
