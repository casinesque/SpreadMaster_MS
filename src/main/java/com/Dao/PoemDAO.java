package com.Dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.Model.Poem;

@Repository
public interface PoemDAO extends CrudRepository <Poem, Integer>{

	public Optional<Poem> findById(Integer Id);
}



	

