package br.com.wagnerandrade.youtube.course.endpoint.service;

import br.com.wagnerandrade.youtube.core.entities.Course;
import br.com.wagnerandrade.youtube.core.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class CourseService {
    private final CourseRepository repository;

    public Page<Course> findAllPage(Pageable pageable) {
        log.info("Listing all courses");
        return this.repository.findAll(pageable);
    }
}
