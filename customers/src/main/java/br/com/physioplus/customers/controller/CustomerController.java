package br.com.physioplus.customers.controller;

import br.com.physioplus.customers.dto.input.CustomerInputDTO;
import br.com.physioplus.customers.dto.output.CustomerOutputDTO;
import br.com.physioplus.customers.model.Customer;
import br.com.physioplus.customers.service.CustomerService;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@AllArgsConstructor
@RequestMapping("/customers")
@RestController
@Api(tags = "Customer", description = "Customer related operations")
public class CustomerController {

	 private CustomerService customerService;

	 @GetMapping("/{id}")
	 @ResponseStatus(HttpStatus.OK)
	 public Optional<Customer> getCustomerById(
			 @PathVariable
					 Long id) {
			return customerService.getCustomerById(id);
	 }

	 @PostMapping
	 @ResponseStatus(HttpStatus.CREATED)
	 public CustomerOutputDTO createCustomer(CustomerInputDTO customerInput) {
			return null;
	 }
}
