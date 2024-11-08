package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food> {
    protected int nbrLegs;

    //constructeurs
    public Terrestrial() {
        super();
    }
    public Terrestrial(String family, String namea, int age, boolean isMammal,int nbrLegs){
        super(family,namea,age,isMammal);
        this.nbrLegs = nbrLegs;
    }

    public String toString(){
        return super.toString()+" ,Number of legs:"+nbrLegs;
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println(getNamea() + " is eating meat.");
        }
    }
    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println(getNamea() + " is eating plants.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(getNamea() + " is eating both plants and meat.");
        } else if (food == Food.MEAT) {
            eatMeat(food);
        } else if (food == Food.PLANT) {
            eatPlant(food);
        }
    }
}
