package io.swagger.api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.xebia.extras.selma.Selma;
import io.swagger.api.mapper.CompetenceMapper;
import io.swagger.api.repository.CategorieRepository;
import io.swagger.api.repository.CompetenceRepository;
import io.swagger.model.Categorie;
import io.swagger.model.Competence;
import io.swagger.modelDTO.CompetenceDTO;

@RestController
public class CompetenceController {

	CompetenceMapper mapper = Selma.builder(CompetenceMapper.class).build();

	@Autowired
	CompetenceRepository competenceRepository;
	@Autowired
	CategorieRepository categorieRepository;

	@PostMapping("/competence")
	Competence create(@RequestBody CompetenceDTO competenceDTO) {
		Competence competence = mapper.asCompetence(competenceDTO);

		Iterable<Competence> compExt=competenceRepository.findByNomCompetence(competence.getNomCompetence());
		String aa=compExt.toString();

		if (aa=="[]" ) {

			return competenceRepository.save(competence);

		} else {
			return null;
		}

//		return competenceRepository.save(competence);
	}

	@GetMapping("/competence")
	Iterable<Competence> read(@RequestBody CompetenceDTO competenceDTO){
		return competenceRepository.findAll();
	}

	@GetMapping("/competence/{id}")
	Competence findById(@PathVariable Integer id) {
		return competenceRepository.findOne(id);
	}
	@GetMapping("/competence/categorieancetre/{id}")
	public ArrayList<Categorie> categorieAncetre(@PathVariable Integer id) {
		//Recup categorie
		Competence competence = competenceRepository.findOne(id);


		ArrayList<Categorie> categoriesAncetre=new ArrayList<Categorie>();
//		Categorie categorie= categorieRepository.findOne(id);
		Categorie categorie= competence.getCategorieParent();
		categoriesAncetre.add(categorie);
		Integer idParent = categorie.getIdCategorieParent();


		while (categorie.getIdCategorieParent()!=null) {
			categorie= categorieRepository.findOne(idParent);
			categoriesAncetre.add(categorie);
			idParent= categorie.getIdCategorieParent();

		}

		return categoriesAncetre;
	}

	@PutMapping("/competence")
	Competence update(@RequestBody CompetenceDTO competenceDTO){

		Competence competence = mapper.asCompetence(competenceDTO);

		return competenceRepository.save(competence);
	}

	@DeleteMapping("/competence/{id}")
	void delete(@PathVariable Integer id) {
		competenceRepository.delete(id);
	}

}
