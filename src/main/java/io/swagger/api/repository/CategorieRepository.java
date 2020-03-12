package io.swagger.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.Categorie;
import io.swagger.model.Collaborateur;
import io.swagger.model.Competence;
import io.swagger.model.Niveau;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

	Iterable<Categorie> findByNomCategorie(String nomCategorie);
	Iterable<Categorie> findByIdCategorieParent(Integer idCategorieParent);
}
