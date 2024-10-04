package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String namea;
    protected int age;
    protected boolean isMammal;

    //les getters
    public String getFamily() {
        return family;
    }
    public String getNamea() {
        return namea;
    }
    public int getAge() {
        return age;
    }
    public boolean isMammal() {
        return isMammal;
    }

    //les setters
    public void setAge(int age) {
        if(age<0){
            System.out.println("Veuillez entrer un age valide");
        }
        else {
            this.age = age;
        }
    }
    public void setFamily(String family) {
        this.family = family;
    }
    public void setName(String name) {
        this.namea = name;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    //les constructeurs
    public Animal() {}

    public Animal(String family, String namea, int age, boolean isMammal) {
        this.family=family;
        this.namea=namea;
        this.age=age;
        this.isMammal=isMammal;
    }

    //les methodes
    public void displayAnimal() {
        System.out.println(family + " " + namea + " " + age + " " + isMammal);
    }

}
