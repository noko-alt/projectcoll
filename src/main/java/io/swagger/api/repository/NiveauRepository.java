package io.swagger.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.Collaborateur;
import io.swagger.model.Competence;
import io.swagger.model.Niveau;

public interface NiveauRepository extends JpaRepository<Niveau, Integer> {
	Iterable<Niveau> findByCompetenceAndCollaborateur(Competence competence, Collaborateur collaborateur);
	Iterable<Niveau> findByCollaborateur(Collaborateur collaborateur);

}
