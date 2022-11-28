package com.triplej.eussyax2.repository;

import com.triplej.eussyax2.model.Todo;
import com.triplej.eussyax2.model.Tutorial;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository  extends JpaRepository<Todo, Long> {
  List<Todo> findByIsComplete(boolean isComplete);
  List<Todo> findByContent(String content);
}
