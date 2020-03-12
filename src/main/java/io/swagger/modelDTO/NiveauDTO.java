package io.swagger.modelDTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class NiveauDTO {

	@JsonProperty
	private Integer id;

	@JsonProperty
	private int niveau;

	private CompetenceDTO competence;

	private CollaborateurDTO collaborateur;

	public CompetenceDTO getCompetence() {
		return competence;
	}

	public void setCompetence(CompetenceDTO competence) {
		this.competence = competence;
	}

	public CollaborateurDTO getCollaborateur() {
		return collaborateur;
	}

	public void setCollaborateur(CollaborateurDTO collaborateur) {
		this.collaborateur = collaborateur;
	}

	public int getNiveau() {
		return niveau;
	}

	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}
}
