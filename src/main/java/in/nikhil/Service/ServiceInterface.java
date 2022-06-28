package in.nikhil.Service;

import java.util.List;

import in.nikhil.binding.Contact;

public interface ServiceInterface {
	//insert/update
	public String upsert(Contact contact);
	
	//view all contacts
	public List<Contact> viewAllContacts();
	
	//delete contact
	public String deleteContact(int id);
	
	//get single contact
	public Contact getContact(int id);
	

}
