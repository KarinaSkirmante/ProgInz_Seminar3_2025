package lv.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@NoArgsConstructor
@ToString
@Table(name = "CustomerAsCompanyTable")
@Entity
public class CustomerAsCompany {
	
	
	@Setter(value = AccessLevel.NONE)
	@Id
	@Column(name = "Casid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int casid;
	
	@NotNull
	@Pattern(regexp = "[L][V][0-9]{11}")
	@Column
	private String companyRegNo;
	
	@NotNull
	@Pattern(regexp = "^\\d+_company_LV\\d{11}$/gm")
	@Column
	private String customerCode;
	
	@NotNull
	@Pattern(regexp = "^[\\+]?[(]?[0-9]{3}[)]?[-\\s\\.]?[0-9]{3}[-\\s\\.]?[0-9]{4,6}$")
	@Column(name = "PhoneNo")
	private String phoneNo;
	
	
	@NotNull
	@Pattern(regexp = "[A-ZĒŪĪĻĶĢŠĀČŅa-zēūīļķģšāžčņ ]+")
	@Size(min = 4, max = 100)
	@Column(name = "Title")
	private String title;


	public CustomerAsCompany(String companyRegNo, String customerCode, String phoneNo, String title) {
		setCompanyRegNo(companyRegNo); 
		setCustomerCode(customerCode);
		setPhoneNo(phoneNo);
		setTitle(title);
	}
	
	
	

}
