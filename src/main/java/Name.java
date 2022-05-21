public class Name {
	
	private static final int VALID_MAX_LENGTH = 5;
	
	private final String name;

	public Name(String name) {
		valid(name);
		this.name = name;
	}

	private void valid(String name) {
		if (name.length() > VALID_MAX_LENGTH) {
			throw new RuntimeException("이름은 5자리를 초과할 수 없습니다.");
		}
	}

	public String getName() {
		return name;
	}

}
