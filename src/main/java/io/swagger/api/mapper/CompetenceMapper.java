package io.swagger.api.mapper;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;
import io.swagger.model.Competence;
import io.swagger.modelDTO.CompetenceDTO;

@Mapper
public interface CompetenceMapper {

	// This will update the given order
	Competence asCompetence(CompetenceDTO in, Competence out);

	// Returns a new instance of CompetenceDTO mapped from Competence source
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	CompetenceDTO asCompetenceDTO(Competence source);

	// Returns a new instance of Competence mapped from CompetenceDTO source
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	Competence asCompetence(CompetenceDTO source);

}