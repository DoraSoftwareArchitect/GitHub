package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "councellor_tbl")
@Getter
@Setter
public class CouncellorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer counsellorId;
	private String name;
	private String email;
	private String pwd;
	private String phno;

	@OneToMany(mappedBy = "councellor", cascade = CascadeType.ALL)

	private List<EnquiryEntity> enquiries;

	// Here we should not write to string method the reason is we can not write
	// because we can see stack overflow.

}