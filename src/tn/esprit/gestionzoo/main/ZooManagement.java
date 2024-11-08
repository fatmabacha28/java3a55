package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.* ;

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
        /*tn.esprit.gestionzoo.entities.Animal[] animals={a1,a2};
        tn.esprit.gestionzoo.entities.Zoo z1=new tn.esprit.gestionzoo.entities.Zoo(animals,"belvedere","tunis");
        z1.displayZoo();
        a1.displayAnimal();
        a2.displayAnimal();*/

        Zoo z1 = new Zoo("Friguia", "Hammamet", 25);
        Zoo z2 = new Zoo("Belvedere", "Tunis", 25);

        /*System.out.println("Ajouter");
        z1.addAnimal(a1);
        z1.addAnimal(a2);
        z1.addAnimal(a3);*/

        z1.displayZoo();
        System.out.println("Recherhce");
        System.out.println(z1.searchAnimal(a2));
        System.out.println(z1.searchAnimal(a3));

        System.out.println("Suppression");
        z1.removeAnimal(a2);
        z1.displayZoo();

        System.out.println("Full");
        System.out.println(z1.isZooFull());

        System.out.println("Comparaison");
        Zoo z3=new Zoo("Belvedere2", "Tunis", 20);
        z3=z3.comparerZoo(z1,z2);
        z3.displayZoo();

        System.out.println("Heritage");
        //Aquatic aquatic=new Aquatic("mamifere","poisson",20,true,"water");
        Terrestrial terrestrial=new Terrestrial("gdhgdg","lion",15,false,4);
        Dolphin dolphin=new Dolphin("Mammifere","Dolphin",10,true,"Pole nord",20);
        Penguin penguin=new Penguin("poupou","Penguin",8,false,"Pole sud",4.5f);
        Penguin penguin1=new Penguin("poupou","Penguin",8,false,"Pole sud",5.6f);
        Penguin penguin2=new Penguin("poupou","Penguin",8,false,"Pole sud",1.5f);

        //System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);


        //aquatic.swim();
        dolphin.swim();
        penguin.swim();

        System.out.println("Ajouter animal aquatique");
        z1.addAquaticAnimal(dolphin);
        z1.addAquaticAnimal(penguin);
        z1.addAquaticAnimal(penguin1);
        z1.addAquaticAnimal(penguin2);
        dolphin.swim();
        penguin.swim();
        z1.displayNumberOfAquaticsByType();
        float maxDepth = z1.maxPenguinSwimmingDepth();
        System.out.println("La profondeur maximale des peinguins dans le zoo est: "+maxDepth);


        System.out.println("Ajouter animal avec exception");
        Zoo zoo = new Zoo("Mon Zoo", "Paris",3);
        try {
            zoo.addAnimal(new Dolphin("Dodo", "dolly",5,false,"ocean",40.5f));
            System.out.println("Nombre d'animaux : " + zoo.getNbranimals());
            zoo.addAnimal(new Penguin("poupou","Penguin",8,false,"Pole sud",4.5f));
            System.out.println("Nombre d'animaux : " + zoo.getNbranimals());
            zoo.addAnimal(new Dolphin("Dodo", "dolly",-10,false,"ocean",40.5f)); // Tentative d'ajout avec âge négatif
        } catch (ZooFullException | InvalidAgeException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Tester l'énumeration");
        Aquatic doudou = new Dolphin("Doudou", "dolly",5,false,"ocean",40.5f);
        Terrestrial boubou = new Terrestrial("Boubou", "bibou",7,true, 4);
        Penguin poupou = new Penguin("poupou","Penguin",8,false,"Pole sud",4.5f);

        doudou.eatMeat(Food.MEAT);
        boubou.eatMeat(Food.MEAT);
        boubou.eatPlant(Food.PLANT);
        boubou.eatPlantAndMeat(Food.BOTH);

    }


    }
