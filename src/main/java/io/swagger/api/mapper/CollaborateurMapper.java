package io.swagger.api.mapper;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;
import io.swagger.model.Collaborateur;
import io.swagger.modelDTO.CollaborateurDTO;

@Mapper
public interface CollaborateurMapper {

	// This will update the given order
	Collaborateur asCollaborateur(CollaborateurDTO in, Collaborateur out);

	// Returns a new instance of CollaborateurDTO mapped from Collaborator source
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	CollaborateurDTO asCollaborateurDTO(Collaborateur source);

	// Returns a new instance of Collaborator mapped from CollaborateurDTO source
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	Collaborateur asCollaborateur(CollaborateurDTO source);

}