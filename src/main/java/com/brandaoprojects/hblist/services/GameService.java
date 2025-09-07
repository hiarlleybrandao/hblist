package com.brandaoprojects.hblist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brandaoprojects.hblist.dto.GameMinDTO;
import com.brandaoprojects.hblist.entities.Game;
import com.brandaoprojects.hblist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	
	}
}
