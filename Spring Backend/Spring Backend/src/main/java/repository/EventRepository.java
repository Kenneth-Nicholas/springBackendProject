package repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Events;

@Repository
public interface EventRepository extends JpaRepository<Events, Integer> {
	
	ArrayList<Events> findByDescriptionContaining(String description);

}
