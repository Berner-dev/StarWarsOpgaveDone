public class Sith extends Character implements ForceUser {

    public Sith(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showInfo();
        System.out.println(name + " uses the dark side!");
    }

    @Override
    public void useForce() {
        System.out.println(name + " uses the dark side of the Force!");
    }
}