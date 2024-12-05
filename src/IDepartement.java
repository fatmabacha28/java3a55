import java.util.TreeSet;
public interface IDepartement {
    void ajouterDepartement(Departement t);
    boolean rechercherDepartement(String nom);
    boolean rechercherDepartement(Departement t);
    void supprimerDepartement(Departement t);
    void displayDepartement();
    TreeSet<Departement> trierDepartementById();
}
