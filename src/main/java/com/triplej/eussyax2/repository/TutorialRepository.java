package com.triplej.eussyax2.repository;

import com.triplej.eussyax2.model.Tutorial;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface TutorialRepository extends JpaRepository<Tutorial, Long> {
  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}