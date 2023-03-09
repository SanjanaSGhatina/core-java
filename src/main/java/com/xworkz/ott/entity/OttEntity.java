package com.xworkz.ott.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="tvshow")
@NamedQuery(name = "findByShow", query = "select enttt from OttEntity enttt where enttt.platform=:cp")
public class OttEntity {
	@Id
	@Column(name="id")
	private int id;

	@Column(name = "a_platform")
	private String platform;

	@Column(name = "a_show")
	private String show;
	
	@Column(name = "a_lang")
	private String language;

	@Column(name = "a_cost")
	private Double cost;

	@Column(name = "a_pack")
	private Double monthlypack;
	

}
