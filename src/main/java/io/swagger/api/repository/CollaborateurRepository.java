package io.swagger.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.swagger.model.Collaborateur;

public interface CollaborateurRepository extends JpaRepository<Collaborateur, Integer> {
	Iterable<Collaborateur> findByPrenomAndNom(String prenom, String nom);
	Iterable<Collaborateur> findByPrenom(String prenom);
	Iterable<Collaborateur> findByNom(String nom);

}
