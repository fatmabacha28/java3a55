
public class Main {
    public static void main(String[] args) {
        // Création d'une instance de SocieteArrayList
        SocieteArrayList gestionEmployes = new SocieteArrayList();

        // Ajout d'employés
        gestionEmployes.ajouterEmploye(new Employe(2, "Bacha", "Fatma", "Informatique", 3));
        gestionEmployes.ajouterEmploye(new Employe(1, "Maatoug", "Hajer", "Ressources Humaines", 2));
        gestionEmployes.ajouterEmploye(new Employe(3, "Saoudi", "Mahdi", "Finance", 4));

        // Affichage des employés
        System.out.println("Liste des employés :");
        gestionEmployes.displayEmploye();

        // Recherche d'un employé par nom
        String nomRecherche = "Bacha";
        boolean trouve = gestionEmployes.rechercherEmploye(nomRecherche);
        System.out.println("Employé " + nomRecherche + " trouvé : " + trouve);

        // Suppression d'un employé
        gestionEmployes.supprimerEmploye(new Employe(2, "Bacha", "Fatma", "Informatique", 2));
        System.out.println("Liste des employés après suppression :");
        gestionEmployes.displayEmploye();

        // Tri des employés par ID
        gestionEmployes.trierEmployeParId();
        System.out.println("Liste des employés triée par ID :");
        gestionEmployes.displayEmploye();

        // Tri des employés par nom, département et grade
        gestionEmployes.trierEmployeParNomDepartementEtGrade();
        System.out.println("Liste des employés triée par nom, département et grade :");
        gestionEmployes.displayEmploye();





        DepartementHashSet gestionDepartements = new DepartementHashSet();

        // Ajout de départements
        gestionDepartements.ajouterDepartement(new Departement(1, "Informatique", 10));
        gestionDepartements.ajouterDepartement(new Departement(2, "Ressources Humaines", 5));
        gestionDepartements.ajouterDepartement(new Departement(3, "Finance", 8));

        // Affichage des départements
        System.out.println("Liste des départements :");
        gestionDepartements.displayDepartement();

        // Recherche d'un département
        System.out.println("Recherche du département 'Informatique' : " +
                gestionDepartements.rechercherDepartement("Informatique"));

        // Suppression d'un département
        gestionDepartements.supprimerDepartement(new Departement(2, "Ressources Humaines", 5));
        System.out.println("Liste des départements après suppression :");
        gestionDepartements.displayDepartement();
    }
}
