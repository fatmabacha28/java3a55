
public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrcages;

    Zoo(){

    }
    Zoo(Animal[] animals,String name,String city, int nbrcages)
    {
        this.animals=animals;
        this.name=name;
        this.city=city;
        this.nbrcages=nbrcages;
    }
    public void displayZoo(){
        System.out.println("Name: "+this.name);
        System.out.println("City: "+this.city);
        System.out.println("Nbrrcages: "+this.nbrcages);
        for(int i=0;i<nbrcages;i++){
            System.out.println("Animal: "+this.animals[i].name);
        }

    }
}