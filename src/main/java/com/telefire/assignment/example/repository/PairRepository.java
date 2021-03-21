package com.telefire.assignment.example.repository;

import com.telefire.assignment.example.models.Pair;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PairRepository extends CrudRepository<Pair, Long> {
	List<Pair> findAll();
}
