package io.swagger.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Categorie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer idCategorieParent;
	private String nomCategorie;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "CATEGORIE_PARENT_ID")
	@JsonManagedReference
	private List<Competence> competences = new ArrayList<Competence>();

	public Integer getIdCategorieParent() {
		return idCategorieParent;
	}

	public void setIdCategorieParent(Integer idCategorieParent) {
		this.idCategorieParent = idCategorieParent;
	}

	public String getNomCategorie() {
		return nomCategorie;
	}

	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public List<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(List<Competence> competences) {
		this.competences = competences;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

}
