package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal {
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
}
