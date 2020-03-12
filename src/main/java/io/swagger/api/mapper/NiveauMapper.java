package io.swagger.api.mapper;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;
import io.swagger.model.Niveau;
import io.swagger.modelDTO.NiveauDTO;

@Mapper
public interface NiveauMapper {

	// This will update the given order
	Niveau asNiveau(NiveauDTO in, Niveau out);

	// Returns a new instance of NiveauDTO mapped from Niveau source
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	NiveauDTO asNiveauDTO(Niveau source);

	// Returns a new instance of Niveau mapped from NiveauDTO source
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	Niveau asNiveau(NiveauDTO source);

}