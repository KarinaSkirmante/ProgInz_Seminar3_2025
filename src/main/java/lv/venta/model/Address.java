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
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lv.venta.enums.City;

@Setter
@NoArgsConstructor
@ToString
@Table(name = "AddressTable")
@Entity
public class Address {
	
	@Setter(value = AccessLevel.NONE)
	@Id
	@Column(name = "Aid")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	
	private City city;
	
	@Min(0)
	@Max(30)
	@Column(name = "HouseNo")
	private int houseNo;
	
	@NotNull
	@Pattern(regexp = "[A-ZĒŪĪĻĶĢŠĀČŅa-zēūīļķģšāžčņ ]+")
	@Size(min = 4, max = 50)
	@Column(name = "Title")
	private String title;
	
	public Address(City city, int houseNo, String title) {
		setCity(city);
		setHouseNo(houseNo);
		setTitle(title);
	}

}
