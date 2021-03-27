package br.com.physioplus.customers.service;

import br.com.physioplus.customers.dto.input.CustomerInputDTO;
import br.com.physioplus.customers.dto.output.CustomerOutputDTO;
import br.com.physioplus.customers.model.Customer;
import br.com.physioplus.customers.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class CustomerService {

	 private CustomerRepository customerRepository;

	 public Optional<Customer> getCustomerById(Long id) {
			return customerRepository.findById(id);
	 }

	 public CustomerOutputDTO createCustomer(CustomerInputDTO customerInput){
	 	 return new CustomerOutputDTO();
	 }
}
