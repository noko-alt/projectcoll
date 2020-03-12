package io.swagger.api.mapper;

import fr.xebia.extras.selma.IgnoreMissing;
import fr.xebia.extras.selma.Mapper;
import fr.xebia.extras.selma.Maps;
import io.swagger.model.Categorie;
import io.swagger.modelDTO.CategorieDTO;

@Mapper
public interface CategorieMapper {

	// This will update the given order
	Categorie asCategorie(CategorieDTO in, Categorie out);

	// Returns a new instance of CategorieDTO mapped from Categorie source
	@Maps(withIgnoreMissing = IgnoreMissing.DESTINATION)
	CategorieDTO asCategorieDTO(Categorie source);

	// Returns a new instance of Categorie mapped from CategorieDTO source
	@Maps(withIgnoreMissing = IgnoreMissing.SOURCE)
	Categorie asCategorie(CategorieDTO source);

}