public class Droid extends Character {

    public Droid(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showInfo();
        System.out.println(name + " repairs a spaceship!");
    }
}