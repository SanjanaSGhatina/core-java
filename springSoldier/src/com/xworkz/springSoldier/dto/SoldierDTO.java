package com.xworkz.springSoldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class SoldierDTO extends AbstractAuditDTO{
	@Min(0)
	@Max(500)
	private int id; 
	@NotNull
	@NotBlank
	@Size(min=3,max=30)
	private String name;
	@NotNull
	@NotBlank
	@Size(min=3,max=30)
	private String rank;
	@NotNull
	@NotBlank
	@Size(min=3,max=30)
	private String betallion;
	@NotNull
	@NotBlank
	@Size(min=3,max=30)
	private String country;
	

}
