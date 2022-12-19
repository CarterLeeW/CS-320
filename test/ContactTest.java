package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import src.Contact;

public class ContactTest {
	
	@Test
	@DisplayName("Contact constructor successfully creates object")
	void contactConstructorSucceeds() {
		String id = "0123456789";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		try {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		} catch (IllegalArgumentException ex) {
			// Object not created successfully
			fail();
		}
	}
	
	@Test
	@DisplayName("Contact Constructor setId too long throws exception")
	void contactConstructorIdExceptionLong() {
		String id = "0123456789X";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setId too short throws exception")
	void contactConstructorIdExceptionShort() {
		String id = "";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setId null throws exception")
	void contactConstructorIdExceptionNull() {
		String id = null;
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setFirstName too long throws exception")
	void contactConstructorFirstNameExceptionLong() {
		String id = "id";
		String firstName = "firstNameTooLong";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setFirstName too short throws exception")
	void contactConstructorFirstNameExceptionShort() {
		String id = "id";
		String firstName = "";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setFirstName null throws exception")
	void contactConstructorFirstNameExceptionNull() {
		String id = "id";
		String firstName = null;
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "address";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setLastName too long throws exception")
	void contactConstructorLastNameExceptionLong() {
		String id = "id";
		String firstName = "firstName";
		String lastName = "lastNameTooLong";
		String phone = "123456789X";
		String address = "address";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setLastName too short throws exception")
	void contactConstructorLastNameExceptionShort() {
		String id = "id";
		String firstName = "firstName";
		String lastName = "";
		String phone = "123456789X";
		String address = "address";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setLastName null throws exception")
	void contactConstructorLastNameExceptionNull() {
		String id = "id";
		String firstName = "firstName";
		String lastName = null;
		String phone = "123456789X";
		String address = "address";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setPhone null throws exception")
	void contactConstructorPhoneExceptionNull() {
		String id = "id";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = null;
		String address = "address";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setPhone long throws exception")
	void contactConstructorPhoneExceptionLong() {
		String id = "id";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "123456789X1";
		String address = "address";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setPhone short throws exception")
	void contactConstructorPhoneExceptionShort() {
		String id = "id";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "123456789";
		String address = "address";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setAddress long throws exception")
	void contactConstructorAddressExceptionLong() {
		String id = "id";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "123456789X123456789X123456789X1";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setAddress short throws exception")
	void contactConstructorAddressExceptionShort() {
		String id = "id";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = "";
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
	
	@Test
	@DisplayName("Contact Constructor setAddress null throws exception")
	void contactConstructorAddressExceptionNull() {
		String id = "id";
		String firstName = "firstName";
		String lastName = "lastName";
		String phone = "123456789X";
		String address = null;
		assertThrows(IllegalArgumentException.class, () -> {
			Contact contact = new Contact(id, firstName, lastName, phone, address);
		});
	}
}