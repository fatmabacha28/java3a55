package tn.esprit.gestionzoo.entities;

public  abstract sealed class Aquatic extends Animal implements Carnivore<Food> permits Dolphin,Penguin{
    protected String habitat;

    //constructeur
    public Aquatic(){
        super();
    }
    public Aquatic(String family, String namea, int age, boolean isMammal,String habitat){
        super(family,namea,age,isMammal);
        this.habitat = habitat;
    }
//les methodes
    public String toString(){
        return super.toString()+" ,Habitat:"+habitat;
    }
    public abstract void swim();


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Aquatic aquatic = (Aquatic) obj;
        return age == aquatic.age &&
                namea.equals(aquatic.namea)&&
                habitat.equals(aquatic.habitat);
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getNamea() + " is eating meat.");
        } else {
            System.out.println(getNamea() + " does not eat this type of food.");
        }
    }



}
