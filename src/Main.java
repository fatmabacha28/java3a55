import java.util.TreeMap;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        EtudiantManagement gestion = new EtudiantManagement();

        // Liste d'étudiants
        List<Etudiant> etudiants = Arrays.asList(
                new Etudiant(1, "Fatma", 20),
                new Etudiant(2, "Hajer", 22),
                new Etudiant(3, "Youssef", 21)
        );

        // Afficher tous les étudiants
        System.out.println("Tous les étudiants :");
        gestion.displayStudents(etudiants, System.out::println);

        // Afficher les étudiants âgés de plus de 20 ans
        System.out.println("\nÉtudiants âgés de plus de 20 ans :");
        gestion.displayStudentsByFilter(etudiants, e -> e.getAge() > 20, System.out::println);

        // Obtenir les noms des étudiants
        String noms = gestion.returnStudentsNames(etudiants, Etudiant::getNom);
        System.out.println("\nNoms des étudiants : " + noms);

        // Créer un nouvel étudiant
        Etudiant nouveau = gestion.createStudent(() -> new Etudiant(4, "Mehdi", 23));
        System.out.println("\nNouveau étudiant créé : " + nouveau);

        // Trier les étudiants par ID
        System.out.println("\nÉtudiants triés par ID :");
        List<Etudiant> etudiantsTries = gestion.sortStudentsById(etudiants, Comparator.comparingInt(Etudiant::getId));
        etudiantsTries.forEach(System.out::println);

        // Convertir en flux et afficher
        System.out.println("\nÉtudiants (flux) :");
        gestion.convertToStream(etudiants)
                .forEach(System.out::println);


    }
}


