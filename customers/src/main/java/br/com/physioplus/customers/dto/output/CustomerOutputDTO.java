package br.com.physioplus.customers.dto.output;

import br.com.physioplus.customers.model.Address;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CustomerOutputDTO {

	 public Long id;
	 public String name;
	 public String email;
	 public Address address;
	 public LocalDate birthdate;
	 public String phone;
	 public String cpf;


	 private CustomerOutputDTO(Long id, String name, String email, Address address, LocalDate birthdate, String phone, String cpf) {
			this.id = id;
			this.name = name;
			this.email = email;
			this.address = address;
			this.birthdate = birthdate;
			this.phone = phone;
			this.cpf = cpf;
	 }
}
