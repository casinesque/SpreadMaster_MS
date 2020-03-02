package com.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.Dao.PoemDAO;
import com.Model.Poem;

@Component
public class GetOneITAServiceImpl implements GetOneITAService{
	
	@Autowired
	PoemDAO poemDAO;

	@Override
	public Optional<Poem> getOnePoemITA() {
		int lower = 1;
		int upper = 245;
		int randomId = (int) (Math.random() * (upper - lower)) + lower;
		Optional<Poem> selectedPoem = poemDAO.findById(randomId);
		if (selectedPoem.isPresent())
			return selectedPoem;
		else
			return null;
	}

}
