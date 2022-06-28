package in.nikhil.binding;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.Data;


@Data
@Entity
@Table(name = "contact_info")
public class Contact {
	@Id
	@GeneratedValue
	private int contactid;

	private String name;
	
	private long phoneno;
	
	private String email;

}
