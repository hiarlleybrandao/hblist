package com.brandaoprojects.hblist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.brandaoprojects.hblist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
