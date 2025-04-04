package lv.venta.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Table(name = "Driver")
@Entity
public class Driver {
	@Setter(value = AccessLevel.NONE)
	@Id
	@Column(name = "Idp")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idp;
	@Column(name = "Name")
	@NotNull
	@Pattern(regexp = "[A-ZĀāČčĒēĢģĪīĶķĻļŅņŠšŪūŽž]{1}[a-zāčēģīķļņšūž ]{2,50}")
	private String name;
	@Column(name = "PersonCode")
	@NotNull
	@Pattern(regexp = "[0-9]{6}-[0-9]{5}")
	private String personCode;
	@Column(name = "Surname")
	@NotNull
	@Pattern(regexp = "[A-ZĀāČčĒēĢģĪīĶķĻļŅņŠšŪūŽž]{1}[a-zāčēģīķļņšūž ]{2,50}")
	private String surname;
	@Min(0)
	@Max(10000)
	@Column(name = "ExperienceInYears")
	private float experienceInYears;
	@Column(name = "LicenseNo")
	@NotNull
	@Pattern(regexp = "[A-ZĀāČčĒēĢģĪīĶķĻļŅņŠšŪūŽž]{1}[a-zāčēģīķļņšūž ]{2,50}")
	private String licenseNo;
	
	public Driver(String name, String surname, String PersonCode, String licenseNo, float experienceInYears) {
		setName(name);
		setSurname(surname);
		setLicenseNo(licenseNo);
		setExperienceInYears(experienceInYears);
		setPersonCode(PersonCode);
		setExperienceInYears(experienceInYears);
		
	}
	
	
	
	
	
	
	
	
	
	
	
}
