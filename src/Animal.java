public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;

    Animal() {}

    Animal(String family, String name, int age, boolean isMammal) {
        this.family=family;
        this.name=name;
        this.age=age;
    }
    public void displayAnimal() {
        System.out.println(family + " " + name + " " + age + " " + isMammal);
    }

}