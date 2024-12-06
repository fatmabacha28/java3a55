import java.util.TreeMap;
public class Main {
    public static void main(String[] args) {
        AffectationHashMap gestionAffectations = new AffectationHashMap();

        // Création des employés
        Employe e1 = new Employe(1, "Bacha", "Fatma", "Informatique", 3);
        Employe e2 = new Employe(2, "Maatoug", "Hajer", "Ressources Humaines", 2);
        Employe e3 = new Employe(3, "Hamadi", "Youssef", "Finance", 4);

        // Création des départements
        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "Ressources Humaines", 5);
        Departement d3 = new Departement(3, "Finance", 8);

        // Instruction 2 : Ajouter des employés aux départements
        gestionAffectations.ajouterEmployeDepartement(e1, d1);
        gestionAffectations.ajouterEmployeDepartement(e2, d2);
        gestionAffectations.ajouterEmployeDepartement(e3, d3);

        // Instruction 3 : Afficher les employés et leurs départements
        System.out.println("Affectations des employés aux départements :");
        gestionAffectations.afficherEmployesEtDepartements();

        // Essayer d'ajouter le même employé dans deux départements différents
        gestionAffectations.ajouterEmployeDepartement(e1, d2);
        System.out.println("Affectations après tentative de double affectation :");
        gestionAffectations.afficherEmployesEtDepartements();

        // Instruction 4 : Supprimer un employé
        gestionAffectations.supprimerEmploye(e2);
        System.out.println("Affectations après suppression de Maatou Hajer :");
        gestionAffectations.afficherEmployesEtDepartements();

        // Instruction 5 : Supprimer un employé d'un département spécifique
        gestionAffectations.supprimerEmployeEtDepartement(e1, d2);
        System.out.println("Affectations après suppression de Fatma Bacha du département RH :");
        gestionAffectations.afficherEmployesEtDepartements();

        // Instruction 6 : Afficher la liste des employés
        System.out.println("Liste des employés :");
        gestionAffectations.afficherEmployes();

        // Instruction 7 : Afficher la liste des départements
        System.out.println("Liste des départements :");
        gestionAffectations.afficherDepartements();

        // Instruction 8 : Rechercher un employé
        System.out.println("Recherche de Youssef Hamadi : " + gestionAffectations.rechercherEmploye(e3));

        // Instruction 9 : Rechercher un département
        System.out.println("Recherche du département Finance : " + gestionAffectations.rechercherDepartement(d3));

        // Instruction 10 : Trier les employés par identifiant
        // Trier les employés par identifiant
        System.out.println("Collection triée par identifiant des employés :");
        System.out.println(gestionAffectations.trierMap());
    }
}


