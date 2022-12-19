package src;

public class Contact {

	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	
	public Contact(String id, String firstName, String lastName, 
			String phone, String address) {
		this.setId(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhone(phone);
		this.setAddress(address);
	}

	public String getId() {
		return id;
	}

	// Id is not allowed to be changed
	private void setId(String id) {
		if (id == null || id.length() < 1 || id.length() > 10) {
			throw  new IllegalArgumentException("id must not be less than 1 or greater than 10 characters.");
		}
		else {
			this.id = id;
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName == null || firstName.length() < 1 || firstName.length() > 10) {
			throw  new IllegalArgumentException("first name must not be less than 1 or greater than 10 characters.");
		}
		else {
			this.firstName = firstName;
		}
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName == null || lastName.length() < 1 || lastName.length() > 10) {
			throw  new IllegalArgumentException("last name must not be less than 1 or greater than 10 characters.");
		}
		else {
			this.lastName = lastName;
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (phone == null || phone.length() != 10) {
			throw  new IllegalArgumentException("phone must be exactly 10 digits");
		}
		else {
			this.phone = phone;
		}
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		if (address == null || address.length() < 1 || address.length() > 30) {
			throw  new IllegalArgumentException("address must not be less than 1 or greater than 30 characters.");
		}
		else {
			this.address = address;
		}
	}
	
}