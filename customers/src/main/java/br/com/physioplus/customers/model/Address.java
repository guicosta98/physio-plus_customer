package br.com.physioplus.customers.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "adresses", schema = "public")
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "adresses_id_seq")
	public Long id;

	public String street;

	@Column(name = "num")
	public String number;

	@Column(name = "zip_code")
	public String zipCode;

	public String district;

	public String city;

	public String complement;
}
