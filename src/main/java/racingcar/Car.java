package racingcar;

public class Car {

    public static final int LIMIT = 5;
    public static final int CONDITION = 4;
    private String name;
    private int position;

    public Car() {
    }

    public Car(String name) {
        this.name = name;
    }

    public void setName(String name) {
        validName(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void validName(String name) {
        if (name.length() > LIMIT) {
            throw new RuntimeException("자동차의 이름은 " + LIMIT + " 초과할 수 없습니다.");
        }
    }

    public void move(int input) {
        if (input < CONDITION) return;
        position++;
    }

    public int getPosition() {
        return position;
    }

}
