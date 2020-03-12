package io.swagger.modelDTO;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;


public class CompetenceDTO {

	@JsonProperty
	private Integer id;

	@JsonProperty
	private String nomCompetence;

	@JsonProperty
	private Integer note;

	public Integer getNote() {
		return note;
	}



	public void setNote(Integer note) {
		this.note = note;
	}



	private List<NiveauDTO> niveaux = new ArrayList<NiveauDTO>();


	private CategorieDTO categorieParent;



	public String getNomCompetence() {
		return nomCompetence;
	}



	public void setNomCompetence(String nomCompetence) {
		this.nomCompetence = nomCompetence;
	}



	public List<NiveauDTO> getNiveaux() {
		return niveaux;
	}



	public void setNiveaux(List<NiveauDTO> niveaux) {
		this.niveaux = niveaux;
	}



	public CategorieDTO getCategorieParent() {
		return categorieParent;
	}



	public void setCategorieParent(CategorieDTO categorieParent) {
		this.categorieParent = categorieParent;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Integer getId() {
		return id;
	}
}
