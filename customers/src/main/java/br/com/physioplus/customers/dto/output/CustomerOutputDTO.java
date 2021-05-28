package br.com.physioplus.customers.dto.output;

import br.com.physioplus.customers.model.Customer;
import lombok.Data;

@Data
public class CustomerOutputDTO {

	 private Long id;

	 private String name;

	 public CustomerOutputDTO(Customer customer) {
			this.id = customer.getId();
			this.name = customer.getName();
	 }

	 public static CustomerOutputDTO of(Customer customer) {
			return new CustomerOutputDTO(customer);
	 }
}
