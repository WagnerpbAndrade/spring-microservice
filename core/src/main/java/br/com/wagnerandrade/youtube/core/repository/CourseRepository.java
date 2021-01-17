package br.com.wagnerandrade.youtube.core.repository;

import br.com.wagnerandrade.youtube.core.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
