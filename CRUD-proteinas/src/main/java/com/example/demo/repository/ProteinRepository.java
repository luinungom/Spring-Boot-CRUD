package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Protein;

public interface ProteinRepository extends JpaRepository<Protein, Long>{
	List<Protein> findByName (String Name);
}
