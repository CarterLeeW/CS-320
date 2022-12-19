package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import src.ContactService;
import src.Contact;

public class ContactServiceTest {
	
	@Test
	@DisplayName("Matching Id Checker throws exception")
	void matchingIdCheckerThrowsEx() {
		String id = "id";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		String douplicateId = id;
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		contactList.add(contact);
		
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService.matchingIdChecker(douplicateId, contactList);
		});
	}
	
	@Test
	@DisplayName("add Contact correctly adds Contact to list")
	void addAppointmentSuccessfully() {
		String id = "id";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		ContactService.addContact(id, firstName, lastName, phone, address, contactList);
		
		assertTrue(contactList.size() == 1);
	}
	
	//FIXME update contact
	@Test
	@DisplayName("update Contact successfully updates a Contact in the list")
	void updateContactSuccessfully() {
		String id = "id";
		String firstName = "firstName";
		String newFirstName = "newName";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		contactList.add(contact);
		
		ContactService.updateContact(id, newFirstName, lastName, phone, address, contactList);
		assertTrue(newFirstName.equals(contactList.get(0).getFirstName()));
	}
	
	@Test
	@DisplayName("update Contact does not update when arguments are illegal")
	void updateContactIllegalArguments() {
		String id = "id";
		String firstName = "firstName";
		String newFirstName = "";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		contactList.add(contact);
		ContactService.updateContact(id, newFirstName, lastName, phone, address, contactList);
		
		// If exception is missed
		if (newFirstName.equals(contactList.get(0).getFirstName())) {
			fail();
		}
	}
	
	@Test
	@DisplayName("update Contact id not found")
	void updateContactIdNotFound() {
		String id = "id";
		String wrongId = "wrongId";
		String firstName = "firstName";
		String newFirstName = "validName";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		contactList.add(contact);
		ContactService.updateContact(wrongId, newFirstName, lastName, phone, address, contactList);
		
		// If exception is missed
		if (newFirstName.equals(contactList.get(0).getFirstName())) {
			fail();
		}
	}
	
	@Test
	@DisplayName("delete Contact correctly deletes Contact from list")
	void deleteAppointmentSuccessfully() {
		String id = "id";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		contactList.add(contact);
		ContactService.deleteContact(id, contactList);
		
		assertTrue(contactList.size() == 0);
	}
	
	@Test
	@DisplayName("delete Contact does not delete when Id not found")
	void deleteAppointmentIdNotFound() {
		String wrongId = "wrong id";
		String id = "id";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		contactList.add(contact);
		ContactService.deleteContact(wrongId, contactList);
		
		assertTrue(contactList.size() == 1);
	}
}