// Carter Wooton SNHU 320 11/13/22
package one.project.CS320.src;

import java.util.ArrayList;


public class ContactService {
	
	/**
	 * Checks if the passed Contact id already exists in the list
	 * @param id
	 * @param contactList
	 */
	public static void existingContactIdChecker(String id, ArrayList<Contact> contactList) {
		for (Contact con : contactList) {
			if (id.equals(con.getId())) {
				throw new IllegalArgumentException("id: " + id + " already exists");
			}
		}
	}
	
	/**
	 * Validates legal arguments for Contact object attributes
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param address
	 * @return
	 */
	public static void contactFieldValidator(String id, String firstName, String lastName, 
			String phone, String address) {
		if (id == null || id.length() > 10 || id.length() < 1) {
			throw new IllegalArgumentException("id cannot be empty or "
					+ "longer than 10 characters.");
		}
		else if (firstName == null || firstName.length() > 10 || firstName.length() < 1) {
			throw new IllegalArgumentException("First name cannot be empty or "
					+ "longer than 10 characters.");
		}
		else if (lastName == null || lastName.length() > 10 || lastName.length() < 1) {
			throw new IllegalArgumentException("Last name cannot be empty or "
					+ "longer than 10 characters.");
		}
		else if ((phone == null) || (phone.length() != 10)) {
			throw new IllegalArgumentException("Phone number cannot be empty "
					+ "and must be exactly 10 integers.");
		}
		else if (address == null || address.length() > 30 || address.length() < 1) {
			throw new IllegalArgumentException("address cannot be empty or "
					+ "longer than 30 characters.");
		}
	}
	
	/**
	 * Adds Contact object to list
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param address
	 * @param contactList
	 */
	public static void addContact(String id, String firstName, String lastName,
			String phone, String address, ArrayList<Contact> contactList) {
		try {
			existingContactIdChecker(id, contactList);
		} catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}
		try {
			contactFieldValidator(id, firstName, lastName, phone, address);
			Contact contact = new Contact(id, firstName, lastName, 
					phone, address);
			contactList.add(contact);
		} catch(IllegalArgumentException ex) {
			System.out.println(ex);
		}
	}
	
	
	/**
	 * Deletes Contact object from list
	 * @param id
	 * @param contactList
	 */
	public static void deleteContact(String id, ArrayList<Contact> contactList) {
		try {
			for (Contact con : contactList) {
				if (id.equals(con.getId())) {
					contactList.remove(con);
					return;
				}
			}
			throw new IllegalArgumentException("deleteContact-> id: " + id + " not found");
		} catch (IllegalArgumentException ex){
			System.out.println(ex);
			return;
		}
	}
	
	/**
	 * Updates Contact object in list
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param address
	 * @param contactList
	 */
	public static void updateContact(String id, String firstName, String lastName,
			String phone, String address, ArrayList<Contact> contactList) {
		try {
			for (Contact con : contactList) {
				if (id.equals(con.getId())) {
					try {
						contactFieldValidator(id, firstName, lastName, phone, address);
						con.setAddress(address);
						con.setFirstName(firstName);
						con.setLastName(lastName);
						con.setPhone(phone);
						return;
					} catch(IllegalArgumentException ex) {
						System.out.println(ex);
						return;
					}
				}
			}
		throw new IllegalArgumentException("updateContact -> id: " + id + " id not found");
		} catch (IllegalArgumentException ex){
			System.out.println(ex);
			return;
		}
	}

	/**
	 * Main method for ContactService.java
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("finshed");
	}
}