package br.com.physioplus.customers.dto.input;

import br.com.physioplus.customers.model.Address;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CustomerInputDTO {

	 private Long id;

	 private Long name;

	 private String email;

	 private Address address;

	 private LocalDate birthDate;

	 private String phone;

	 private String cpf;
}

