package racingcar;

public class Car {

    public static final int LIMIT = 5;
    private String name;

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

}
