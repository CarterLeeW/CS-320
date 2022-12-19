// Carter Wooton SNHU 320 11/13/22
package one.project.CS320.src;


public class Contact {
	
	private String id;
	private String firstName;
	private String lastName;
	private String phone;
	private String address;

	public Contact() {}
	public Contact(String id, String firstName, String lastName, 
			String phone, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
	}

	// Id is not allowed to be changed once set.
	public String getId() {
		return id;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return (this.id + " " + this.firstName + " " + this.lastName + " " +
					this.phone + " " + this.address);
	}
	
	
}