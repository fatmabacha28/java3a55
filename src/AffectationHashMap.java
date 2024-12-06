import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    // Instruction 2 : Ajouter un employé à un département
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        affectations.put(e, d);
    }

    // Instruction 3 : Afficher les employés et leurs départements
    public void afficherEmployesEtDepartements() {
        System.out.println("Liste des affectations :");
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println("Employé : " + entry.getKey() + " => Département : " + entry.getValue());
        }
    }

    // Instruction 4 : Supprimer un employé
    public void supprimerEmploye(Employe e) {
        affectations.remove(e);
    }

    // Instruction 5 : Supprimer un employé d'un département spécifique
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {
        if (affectations.containsKey(e) && affectations.get(e).equals(d)) {
            affectations.remove(e);
        }
    }

    // Instruction 6 : Afficher la liste des employés
    public void afficherEmployes() {
        System.out.println("Liste des employés :");
        for (Employe e : affectations.keySet()) {
            System.out.println(e);
        }
    }

    // Instruction 7 : Afficher la liste des départements
    public void afficherDepartements() {
        System.out.println("Liste des départements :");
        for (Departement d : affectations.values()) {
            System.out.println(d);
        }
    }

    // Instruction 8 : Rechercher un employé
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // Instruction 9 : Rechercher un département
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    // Instruction 10 : Trier les employés par identifiant
    public TreeMap<Employe, Departement> trierMap() {
        return new TreeMap<>(affectations);
    }
}
