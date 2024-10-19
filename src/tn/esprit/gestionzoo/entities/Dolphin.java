package tn.esprit.gestionzoo.entities;

public non-sealed class Dolphin extends Aquatic{
    protected float swimmingSpeed;

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    //constructeur
    public Dolphin(){

    }
    public Dolphin(String family, String namea, int age, boolean isMammal,String habitat,float swimmingSpeed){
        super(family,namea,age,isMammal,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    //les methodes
    public String toString(){
        return super.toString()+" ,swimming speed:"+swimmingSpeed;
    }

    @Override
    public  void swim(){
        System.out.println("This dolphin animal is swimming");
    }
}
