package src;

import java.util.ArrayList;

public class ContactService {
	
	/**
	 * Checks if the passed Contact id already exists in the list
	 * @param id
	 * @param contactList
	 */
	public static void matchingIdChecker(String id, ArrayList<Contact> contactList) {
		for (Contact con : contactList) {
			if (id.equals(con.getId())) {
				throw new IllegalArgumentException("id: " + id + " already exists");
			}
		}
	}
	/**
	 * Adds Contact object to the list
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
			matchingIdChecker(id, contactList);
		} catch(IllegalArgumentException ex) {
			System.out.println(ex);
			return;
		}
		try {
			Contact newContact = new Contact(id, firstName, lastName, 
					phone, address);
			contactList.add(newContact);
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
			for (Contact contact : contactList) {
				if (id.equals(contact.getId())) {
					try {
						contact.setFirstName(firstName);
						contact.setLastName(lastName);
						contact.setPhone(phone);
						contact.setAddress(address);
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
	
	public static void main(String[] args) {
		System.out.println("finished");
	}
}