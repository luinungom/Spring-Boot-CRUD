package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Protein;
import com.example.demo.repository.ProteinRepository;

@Service
public class ProteinService {

	@Autowired
	private ProteinRepository proteinRep;
	
	/**
	 * Method to get all proteins
	 * @return proteins list
	 */
	public List<Protein> findAll(){
		return proteinRep.findAll();
	}
	
	/**
	 * Method to find proteins by id
	 * @param id Protein's id
	 * @return Object Protein
	 */
	public Protein findById(Long id) {
		return proteinRep.findById(id).orElse(new Protein());
	}
	
	/**
	 * Method to delete a protein
	 * @param id protein id to be deleted
	 * @return deleted protein
	 * @throws IllegalArgumentException if protein id does not exist
	 */
	public Protein delete(Long id) throws IllegalArgumentException {
		Protein result = findById(id);
		if(result == null) {
			throw new IllegalArgumentException ("Id cannot be null or protein does not exist");
		}
		proteinRep.delete(result);
		return result;
	}
	
	/**
	 * Method to delete a protein
	 * @param protein to be deleted
	 */
	public void delete(Protein protein) {
		proteinRep.delete(protein);
	}
	
	/**
	 * Method to save a protein in the database
	 * @param protein to be saved
	 * @return saved protein
	 */
	public Protein save(Protein protein) {
		return proteinRep.save(protein);
	}
}
