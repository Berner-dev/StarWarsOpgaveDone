public class BountyHunter extends Character {

    public BountyHunter(String name, int age) {
        super(name, age);
    }

    @Override
    public void action() {
        super.showInfo();
        System.out.println(name + " is hunting someone!");
    }

    public void hunt() {
        System.out.println(name + " is hunting a target.");
    }
}

