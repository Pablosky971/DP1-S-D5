package acme.entities.inquiries;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.Valid;
import javax.validation.constraints.Email;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
	
public class Inquiries extends DomainEntity{
	
	// Serialisation identifier
		
	private static final long serialVersionUID = 1L;
		
		
	@NotBlank
	private String title;
	
	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@Past
	private Date dateOfCreation;
	

	@Temporal(TemporalType.TIMESTAMP)
	@NotNull
	@Future
	private Date deadline;
	
	@NotBlank
	private String description;
	

	@NotNull
	@Valid
	private Money minMoney;
	
	@NotNull
	@Valid
	private Money maxMoney;
	
	@NotBlank
	@Email
	private String email;
		
	
		

}
