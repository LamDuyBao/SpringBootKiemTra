package com.hcmute.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "Category")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id", columnDefinition = "nvarchar(100)")
	public int id;
	@Column(name = "category_name", columnDefinition = " nvarchar(100)")
	public String name;
	@Column(name = "image", columnDefinition = "nvarchar(100)")
	public String image;
	@Column(name = "status", columnDefinition = "int")
	public int status;
}
