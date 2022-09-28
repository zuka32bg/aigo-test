package rs.aigo.springdata.associations.repos;

import org.springframework.data.repository.CrudRepository;

import rs.aigo.springdata.associations.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
