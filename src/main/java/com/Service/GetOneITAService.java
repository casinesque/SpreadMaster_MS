package com.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.Model.Poem;


@Service
public interface  GetOneITAService {
	
	public Optional<Poem> getOnePoemITA ();

}
