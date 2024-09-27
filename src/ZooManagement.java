import java.util.Scanner;

public class ZooManagement{
    public static void main(String[] args) {
        /*
        int nbrcages = 20;
        String zooName = "my zoo";
        System.out.printf(zooName + " comporte " + nbrcages + " cages");

        Scanner sc=new Scanner(System.in);
        System.out.println("Entrer le nom du zoo: ");
        String zooName = sc.nextLine();
        System.out.println("Entrer le nombre de cages: ");
        while(!sc.hasNextInt()){
            System.out.println("veuillez entrer le nombre de cages correcte: ");
            sc.nextLine();
        }
        int nbrcages = sc.nextInt();


        // Output input by user
        System.out.println("nom du zoo: " + zooName);
        System.out.println("nombre de cages: " + nbrcages);
         */


        Animal a1=new Animal("mamifere","balene",10,true);
        Animal a2=new Animal("mamifere","daufin",7,true);
        Animal a3=new Animal("mamifere","simba",5,true);
        /*Animal[] animals={a1,a2};
        Zoo z1=new Zoo(animals,"belvedere","tunis");
        z1.displayZoo();
        a1.displayAnimal();
        a2.displayAnimal();*/

        Zoo z1 = new Zoo("Friguia", "Hammamet", 25);
        Zoo z2 = new Zoo("Belvedere", "Tunis", 25);

        System.out.println("Ajouter");
        z1.addAnimal(a1);
        z1.addAnimal(a2);
        z1.addAnimal(a3);

        z1.displayZoo();
        System.out.println("Recherhce");
        System.out.println(z1.searchAnimal(a2));
        System.out.println(z1.searchAnimal(a3));

        System.out.println("Suppression");
        z1.removeAnimal(a2);
        z1.displayZoo();

        System.out.println("Full");
        System.out.println(z1.isZooFull(z1));

        System.out.println("Comparaison");
        Zoo z3=new Zoo();
        z3=z3.comparerZoo(z1,z2);
        z3.displayZoo();




    }
}