package br.com.wagnerandrade.youtube.course.endpoint.resource;

import br.com.wagnerandrade.youtube.core.entities.Course;
import br.com.wagnerandrade.youtube.course.endpoint.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/admin/courses")
@RequiredArgsConstructor
public class CourseResource {
    private final CourseService service;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Page<Course>> list(Pageable pageable) {
        return ResponseEntity.ok().body(this.service.findAllPage(pageable));
    }
}
