// Carter Wooton SNHU 320 11/13/22
package one.project.CS320.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import one.project.CS320.src.Contact;
import one.project.CS320.src.ContactService;

import org.junit.jupiter.api.DisplayName;

class ContactServiceTest {
	
	@Test
	@DisplayName("Existing ContactIdChecker Throws Exception")
	void existingContactIdCheckerExistingException() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		Contact contact = new Contact("1000000000", "firstName", "lastName", "0123456789", "address");
		contactList.add(contact);
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService.existingContactIdChecker("1000000000", contactList);
		});
	}
	
	
	@Test
	@DisplayName("Contact Field Validator id Throws Exception")
	void contactFieldValidatorIdException() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService.contactFieldValidator("123456789X1", "firstName", 
					"lastName", "0123456789", "address");
		});
	}
	
	@Test
	@DisplayName("Contact Field Validator firstName Throws Exception")
	void contactFieldValidatorFirstNameException() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService.contactFieldValidator("123456789", "firstNamexxxxx", 
					"lastName", "0123456789", "address");
		});
	}
	
	@Test
	@DisplayName("Contact Field Validator lastName Throws Exception")
	void contactFieldValidatorLastNameException() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService.contactFieldValidator("123456789", "firstName", 
					"lastNamexxxxx", "0123456789", "address");
		});
	}
	
	@Test
	@DisplayName("Contact Field Validator phone Throws Exception")
	void contactFieldValidatorPhoneException() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService.contactFieldValidator("123456789", "firstName", 
					"lastName", "012345678", "address");
		});
	}
	
	@Test
	@DisplayName("Contact Field Validator address Throws Exception")
	void contactFieldValidatorAddressException() {
		assertThrows(IllegalArgumentException.class, () -> {
			ContactService.contactFieldValidator("123456789", "firstName", 
					"lastName", "0123456789", "");
		});
	}
	
	@Test
	@DisplayName("Contact Field Validator throws no exception")
	void contactFieldValidatorNoException() {
		try {
			ContactService.contactFieldValidator("123456789", "firstName", 
					"lastName", "0123456789", "address");
		} catch(IllegalArgumentException ex) {
			//Should throw no exception
			fail();
		}
	}
	
	@Test
	@DisplayName("Add Contact Correctly Adds Contact To List")
	void addContactSuccessfully() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		
		ContactService.addContact("1000000000", "firstName", "lastName", "0123456789", "address", contactList);
		
		assertTrue(contactList.size() == 1);
		assertFalse(contactList.size() == 0);
	}
	
	@Test
	@DisplayName("Delete Contact Correctly Removes Contact From List")
	void deleteContactSuccessfully() {
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		Contact contact = new Contact("1000000000", "firstName", "lastName", "0123456789", "address");
		contactList.add(contact);
		
		
		ContactService.deleteContact("1000000000", contactList);
		assertTrue(contactList.size() == 0);
		assertFalse(contactList.size() == 1);
	}
	
	@Test
	@DisplayName("Update Contact Correctly Updates Contact In List")
	void updateContactSuccessfully() {
		String nameChange = "nameChange";
		ArrayList<Contact> contactList = new ArrayList<Contact>();
		Contact contact = new Contact("1000000000", "firstName", "lastName", "0123456789", "address");
		
		contactList.add(contact);
		
		ContactService.updateContact("1000000000", "firstName", nameChange, "0123456789", "address", contactList);
		assertTrue(nameChange.equals(contactList.get(0).getLastName()));
	}
}