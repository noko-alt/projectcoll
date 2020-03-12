package io.swagger.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Competence {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private String nomCompetence;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "COMPETENCE_ID")
	@JsonBackReference
	private List<Niveau> niveaux = new ArrayList<Niveau>();

	@ManyToOne
	@JsonBackReference
	private Categorie categorieParent;

	@Transient
	private Integer note;

	public Integer getNote() {
		return note;
	}

	public void setNote(Integer note) {
		this.note = note;
	}

	public Categorie getCategorieParent() {
		return categorieParent;
	}

	public void setCategorieParent(Categorie categorieParent) {
		this.categorieParent = categorieParent;
	}

	public Integer getId() {
		return id;
	}

	public String getNomCompetence() {
		return nomCompetence;
	}

	public void setNomCompetence(String nomCompetence) {
		this.nomCompetence = nomCompetence;
	}

	public List<Niveau> getNiveaux() {
		return niveaux;
	}

	public void setNiveaux(List<Niveau> niveaux) {
		this.niveaux = niveaux;
	}
	public void addNiveau(Niveau niveau) {
		this.niveaux.add(niveau);
	}

	public void setId(Integer id) {
		this.id = id;
	}

}
