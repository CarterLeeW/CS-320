// Carter Wooton SNHU 320 11/13/22
package one.project.CS320.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import one.project.CS320.src.Contact;

import org.junit.jupiter.api.DisplayName;

class ContactTest {

	@Test
	@DisplayName("Contact constructor with all arguments not null")
	void testContactConstructorNotNull() {
		Contact contact = new Contact("id", "firstName", "lastName", 
				"phone", "address");
		assertNotNull(contact.getId());
		assertNotNull(contact.getFirstName());
		assertNotNull(contact.getLastName());
		assertNotNull(contact.getPhone());
		assertNotNull(contact.getAddress());
	}
	
	@Test
	@DisplayName("Contact constructor correctly sets attributes")
	void testContactConstructorAttributes() {
		String id = "id";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "phone";
		String address = "address";
		Contact contact = new Contact(id, firstName, lastName, phone, address);
		assertTrue(id.equals(contact.getId()));
		assertTrue(firstName.equals(contact.getFirstName()));
		assertTrue(lastName.equals(contact.getLastName()));
		assertTrue(phone.equals(contact.getPhone()));
		assertTrue(address.equals(contact.getAddress()));
		
	}
}