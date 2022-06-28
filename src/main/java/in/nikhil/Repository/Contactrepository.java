package in.nikhil.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nikhil.binding.Contact;

public interface Contactrepository extends JpaRepository<Contact, Integer> {
	
	

}
