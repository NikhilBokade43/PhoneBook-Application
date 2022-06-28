package in.nikhil.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nikhil.Repository.Contactrepository;
import in.nikhil.binding.Contact;

@Service
public class ContactServiceImpl implements ServiceInterface {

	@Autowired
	private Contactrepository repo;

	@Override
	public String upsert(Contact contact) {
		Contact cont = repo.save(contact);
		return "success";
	}

	@Override
	public List<Contact> viewAllContacts() {
		List<Contact> contactsList = repo.findAll();
		return contactsList;
	}

	@Override
	public String deleteContact(int id) {
		repo.deleteById(id);
		return "Success";
	}

	@Override
	public Contact getContact(int id) {
		Optional<Contact> findById = repo.findById(id);
		if(findById.isPresent()) {
			return findById.get();
		}
		return null;
	}

}
