package in.nikhil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

 
import in.nikhil.Service.ServiceInterface;
import in.nikhil.binding.Contact;

@RestController
public class ContactRestController {

	@Autowired
	private ServiceInterface service;

	@PostMapping("/contact")
	public ResponseEntity<String> saveContact(Contact contact) {

		String result = service.upsert(contact);
		return new ResponseEntity<>(result, HttpStatus.CREATED);
	} 

	@GetMapping("/contacts")
	public ResponseEntity<List<Contact>> ViewAllContacts() {
		List<Contact> contactsList = service.viewAllContacts();
		return new ResponseEntity<>(contactsList, HttpStatus.OK);
	}

	@GetMapping("/contact/{id}")
	public ResponseEntity<Contact> getContact(@PathVariable int id) {
		Contact msg = service.getContact(id);
		return new ResponseEntity<>(msg, HttpStatus.OK);
	}

	@DeleteMapping("/contact/{id}")
	public ResponseEntity<String> deleteContact(@PathVariable int id) {
		String contact = service.deleteContact(id);
		return new ResponseEntity<>(contact, HttpStatus.OK);

	}

}
