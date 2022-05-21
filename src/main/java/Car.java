public class Car {
    private final Name name;
    private final Position position;

    public Car(String name) {
        this.name = new Name(name);
        this.position = new Position();
    }

    public String getName() {
        return name.getName();
    }

    public int getPosition() {
        return position.getPosition();
    }

    public int move(int input) {
        return position.move(input);
    }

//    protected int randNum() {
//        Random random = new Random();
//        return random.nextInt(10);
//    }
}
