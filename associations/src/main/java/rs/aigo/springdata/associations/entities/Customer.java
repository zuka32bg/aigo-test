package rs.aigo.springdata.associations.entities;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String number;
	private String address;

	@OneToMany(mappedBy = "customer" )
	private Set <PhoneNumber> numbers;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Set <PhoneNumber> getNumbers() {
		return numbers;
	}
	public void setNumbers(Set <PhoneNumber> numbers) {
		this.numbers = numbers;
	}
	
}
