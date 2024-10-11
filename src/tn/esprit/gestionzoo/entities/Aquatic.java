package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal{
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
    public void swim(){
        System.out.println("This aquatic animal is swimming");
    }



}
