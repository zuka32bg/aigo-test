package rs.aigo.springdata.associations;

import java.util.HashSet;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import rs.aigo.springdata.associations.entities.Customer;
import rs.aigo.springdata.associations.entities.PhoneNumber;
import rs.aigo.springdata.associations.repos.CustomerRepository;

@SpringBootTest
class AssociationsApplicationTests {
	
	@Autowired
	CustomerRepository repository;

	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void testCreateCustomer() {
		
		Customer c = new Customer();
		c.setName("JA");
		HashSet<PhoneNumber> num = new HashSet<PhoneNumber>();
		PhoneNumber ph1 = new PhoneNumber();
		ph1.setNumber("12312312312");
		ph1.setType("cell");
		num.add(ph1);
		
		PhoneNumber ph2 = new PhoneNumber();
		ph2.setNumber("548768973");
		ph2.setType("cell");
		num.add(ph2);
		
		c.setNumbers(num);
		repository.save(c);
	}

}
