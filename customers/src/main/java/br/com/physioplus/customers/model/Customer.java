package br.com.physioplus.customers.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers", schema = "public")
public class Customer {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "customers_id_seq")
	 private Long id;

	 private String name;

	 private String email;

	 @OneToOne
	 private Address address;

	 private LocalDate birthdate;

	 private String phone;

	 private String cpf;

}
