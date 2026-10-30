public class CloneTrooper extends Character {

    public CloneTrooper(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showInfo();
        System.out.println(name + " fires a blaster!");
    }
}