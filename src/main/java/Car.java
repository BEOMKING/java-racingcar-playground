public class Car {

    public static final int VALID_LENGTH = 5;
    public static final int FORWARD_NUM = 4;

    private String name;
    private int position;

    public Car(String name) {
        validName(name);
        this.name = name;
    }

    private void validName(String name) {
        if (name.length() > VALID_LENGTH) {
            throw new RuntimeException();
        }
    }

    public String getName() {
        return name;
    }

    public int move(int number) {
        if (number >= FORWARD_NUM) {
            return ++position;
        }
        return position;
    }

//    protected int randNum() {
//        Random random = new Random();
//        return random.nextInt(10);
//    }
}
