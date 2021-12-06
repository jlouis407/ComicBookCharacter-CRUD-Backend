package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.ComicBookCharacter;

@Repository
public interface ComicBookCharacterRepository extends JpaRepository<ComicBookCharacter, Long> {

}
