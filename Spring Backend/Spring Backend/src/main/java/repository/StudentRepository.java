package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

}

// By extending the JpaRepository, you now have all the functionality
// of it, including, add, delete, etc. So that you can interact
// with the DB.