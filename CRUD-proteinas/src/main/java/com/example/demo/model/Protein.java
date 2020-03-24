package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

@Entity
public class Protein {

	@Id
	@GeneratedValue
	private Long id;

	@NotEmpty
	private String name;
	private String uniProt;
	private String gene;
	private String organism;
	@Lob
	private String description;
	@URL
	private String image;
	@URL
	private String link;

	// Constructor
	public Protein(@NotEmpty String name, String uniProt, String gene, String organism, String link) {
		super();
		this.name = name;
		this.uniProt = uniProt;
		this.gene = gene;
		this.organism = organism;
		this.link = link;
	}

	public Protein() {
		super();
	}

	// Getters and setters
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUniProt() {
		return uniProt;
	}

	public void setUniProt(String uniProt) {
		this.uniProt = uniProt;
	}

	public String getGene() {
		return gene;
	}

	public void setGene(String gene) {
		this.gene = gene;
	}

	public String getOrganism() {
		return organism;
	}

	public void setOrganism(String organism) {
		this.organism = organism;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;

	}
}
