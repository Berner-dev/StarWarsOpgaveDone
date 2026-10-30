public class Jedi extends Character implements ForceUser {

    public Jedi(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showInfo();
        System.out.println(name + " swings a lightsaber!");
    }

    public void meditate() {
        System.out.println(name + " is meditating.");
    }

    @Override
    public void useForce() {
        System.out.println(name + " uses the Force!");
    }
}