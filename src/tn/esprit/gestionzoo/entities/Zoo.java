package tn.esprit.gestionzoo.entities;

public class Zoo {
    protected Animal[] animals;
    protected String namez;
    protected String city;
    protected final int NB_CAGES = 25;
    protected int nbranimals;
    protected Aquatic[] aquaticAnimals=new Aquatic[10];
    protected int aquaticnbr = 0;

    //les getters
    public Animal[] getAnimals() {
        return animals;
    }
    public String getNamez() {
        return namez;
    }
    public String getCity() {
        return city;
    }
    public int getNB_CAGES() {
        return NB_CAGES;
    }

    public int getNbranimals() {
        return nbranimals;
    }

    public Aquatic[] getAquaticAnimals() {
        return aquaticAnimals;
    }

    //les setters
    public void setNamez(String namez) {
        if(namez.isEmpty()){
            System.out.println("Le nom ne peut pas etre vide");
        }
        else{
            this.namez = namez;
        }
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setNbranimals(int nbranimals) {
        this.nbranimals = nbranimals;
    }
    public void setAquaticAnimals(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    //les constructeurs
    public Zoo(){

    }
    public Zoo(String name, String city, int nbranimals) {
        this.namez = name;
        this.city = city;
        animals = new Animal[nbranimals];
    }

    public Zoo(Aquatic[] aquaticAnimals) {
        this.aquaticAnimals = aquaticAnimals;
    }

    //les methodes
    public void displayZoo(){
        System.out.println("Name: "+this.namez);
        System.out.println("City: "+this.city);
        System.out.println("Nbrrcages: "+this.NB_CAGES);
        for(int i=0;i<NB_CAGES;i++){
            if(animals[i] != null){
                System.out.println("tn.esprit.gestionzoo.entities.Animal: "+this.animals[i].namea);
            }
            else{
                System.out.println("tn.esprit.gestionzoo.entities.Animal: null");
            }

        }

    }
    public String toString(){
        return "Name: " + namez+ " ,City: " + city+ " ,Nbr Cages: " + NB_CAGES;
    }

    /*public  boolean addAnimal(Animal animal)
    {
        if (searchAnimal(animal) == -1 && !isZooFull())  {
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
            System.out.println("tn.esprit.gestionzoo.entities.Animal existe déjà");
            return false;

        }
    }*/
    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        // Vérifiez si l'animal a un âge négatif
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif !");
        }

        // Vérifiez si le zoo est plein
        if (isZooFull()) {
            throw new ZooFullException("Le zoo est plein !");
        }

        // Vérifiez si l'animal existe déjà
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal existe déjà.");
            return; // Vous pouvez choisir de lancer une exception ici aussi
        }

        // Ajoutez l'animal
        animals[nbranimals] = animal;
        nbranimals++;
        System.out.println("Animal ajouté avec succès !");
    }


    public int searchAnimal(Animal animal){
        for (int i = 0; i <nbranimals; i++) {
            if (animals[i].namea.equals(animal.namea)) {
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
    public boolean isZooFull(){
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
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticnbr < aquaticAnimals.length) {
            aquaticAnimals[aquaticnbr++] = aquatic;
        } else {
            System.out.println("Le zoo est plein !");
        }
    }
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0;
        for (int i = 0; i < aquaticnbr; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                float depth = ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
                if (depth > maxDepth) {
                    maxDepth = depth;
                }
            }
        }
        return maxDepth;
    }
    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < aquaticnbr; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de pingouins : " + penguinCount);
    }

}