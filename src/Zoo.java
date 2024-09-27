
public class Zoo {
    Animal[] animals;
    String name;
    String city;
    final int NB_CAGES = 25;
    int nbranimals;

    Zoo(){

    }
    public Zoo(String name, String city, int nbranimals) {
        this.name = name;
        this.city = city;
        animals = new Animal[nbranimals];
    }
    public void displayZoo(){
        System.out.println("Name: "+this.name);
        System.out.println("City: "+this.city);
        System.out.println("Nbrrcages: "+this.NB_CAGES);
        for(int i=0;i<NB_CAGES;i++){
            if(animals[i] != null){
                System.out.println("Animal: "+this.animals[i].name);
            }
            else{
                System.out.println("Animal: null");
            }

        }

    }
    public String toString(){
        return "Name: " + name+ " ,City: " + city+ " ,Nbr Cages: " + NB_CAGES;
    }

    public  boolean addAnimal(Animal animal)
    {
        if (searchAnimal(animal) == -1)  {
            if((nbranimals < NB_CAGES)) {
                animals[nbranimals] = animal;
                nbranimals++;
                return true;
            }
            else{
                System.out.println("Le tableau est plein");
                return false;
            }
        }
        else {
            System.out.println("Animal existe déjà");
            return false;

        }
    }

    public int searchAnimal(Animal animal){
        for (int i = 0; i <nbranimals; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;

    }
    public boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal);
        if(index != -1){
            for(int i=index; i<nbranimals-1 ; i++){
                animals[i] = animals[i+1];
            }
            animals[nbranimals-1] = null;
            nbranimals--;
            return true;
        }
        return false;
    }
    public boolean isZooFull(Zoo zoo){
        return (nbranimals == NB_CAGES);
    }
    public Zoo comparerZoo(Zoo z1, Zoo z2){
        if(z1.nbranimals > z2.nbranimals){
            return z1;
        }
        else
        if(z2.nbranimals > z1.nbranimals){
            return z2;
        }
        else {
            System.out.println("Les 2 zoo sont les memes");
            return z1;
        }
    }
}