package br.com.physioplus.customers.service;

import br.com.physioplus.customers.dto.input.CustomerInputDTO;
import br.com.physioplus.customers.dto.output.CustomerOutputDTO;
import br.com.physioplus.customers.model.Address;
import br.com.physioplus.customers.model.Customer;
import br.com.physioplus.customers.repository.AddressRepository;
import br.com.physioplus.customers.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@AllArgsConstructor
@Service
public class CustomerService {

	 private CustomerRepository customerRepository;
	 private AddressRepository addressRepository;

	 public Optional<Customer> getCustomerById(Long id) {
			return customerRepository.findById(id);
	 }

	 public CustomerOutputDTO createCustomer(CustomerInputDTO customerInput) {
			addressRepository.save(customerInput.getAddress());
			Customer customer = Customer.builder()
					.name(customerInput.getName())
					.address(customerInput.getAddress())
					.birthdate(customerInput.getBirthDate())
					.email(customerInput.getEmail())
					.cpf(customerInput.getCpf())
					.phone(customerInput.getPhone())
					.build();
			return CustomerOutputDTO.of(customerRepository.save(customer));
	 }

	 public List<Customer> getAllCustomers(){
	 	return customerRepository.findAll();
	 }
}
