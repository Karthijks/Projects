package a;

import javax.validation.constraints.NotEmpty;

public class Name {
	@NotEmpty
	String firstName;
	@NotEmpty
	String lastName;

	protected Name() {
	}

	public Name(@NotEmpty String firstName, @NotEmpty String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}