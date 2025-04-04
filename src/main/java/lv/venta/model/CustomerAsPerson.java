package lv.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@NoArgsConstructor
@ToString
@Table(name = "CustomerAsPerson")
@Entity
public class CustomerAsPerson {
	@Setter(value = AccessLevel.NONE)
	@Id
	@Column(name = "Idc2")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idc2;
	@Column(name = "CustomerCode")
	@NotNull
	@Pattern(regexp = "[A-ZĀāČčĒēĢģĪīĶķĻļŅņŠšŪūŽž]{1}[a-zāčēģīķļņšūž ]{2,50} [0-9]{6}-[0-9]{5}")
	private String customerCode;
	@Column(name = "PersonCode")
	@NotNull
	@Pattern(regexp = "[0-9]{6}-[0-9]{5}")
	private String personCode;
	@Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$")
	@Column(name = "PhoneNo")
	private String phoneNo;
	
	
	@ManyToOne
	@JoinColumn(name = "Aid")
	private Address address;
	
	
	public CustomerAsPerson(String CustomerCode, String PersonCode, String PhoneNo) {
		setCustomerCode(CustomerCode);
		setPersonCode(PersonCode);
		setPhoneNo(PhoneNo);
	}
	
	
	
	
	
	
	
}
