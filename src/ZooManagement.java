import java.util.Scanner;

public class ZooManagement{
    public static void main(String[] args) {
        /*
        int nbrcages = 20;
        String zooName = "my zoo";
        System.out.printf(zooName + " comporte " + nbrcages + " cages");
        */
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
        Animal a1=new Animal("mamifere","balene",10,true);
        Animal a2=new Animal("mamifere","daufin",7,true);
        Animal[] animals={a1,a2};
        Zoo z1=new Zoo(animals,"belvedere","tunis",2);
        z1.displayZoo();
        a1.displayAnimal();
        a2.displayAnimal();





    }
}