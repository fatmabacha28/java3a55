package tn.esprit.gestionzoo.entities;

public non-sealed class Penguin extends Aquatic{
    protected float swimmingDepth;

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    //constructeurs
    public Penguin() {

    }
    public Penguin(String family, String namea, int age, boolean isMammal,String habitat, float swimmingDepth){
        super(family,namea,age,isMammal,habitat);
        this.swimmingDepth = swimmingDepth;
    }


    public String toString(){
        return super.toString()+" ,swimming depth:"+swimmingDepth;
    }
    @Override
    public void swim() {
        System.out.println("This penguin animal is swimming");
    }
}
