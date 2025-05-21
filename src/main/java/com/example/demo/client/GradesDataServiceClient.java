package com.example.demo.client;

import com.example.demo.dtos.CourseDTO;
import com.example.demo.dtos.CourseGradeDTO;
import com.example.demo.dtos.GradeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("grades-data-service")
public interface GradesDataServiceClient {

    @GetMapping("/api/course/{courseCode}")
    CourseDTO getCourseByCode(@PathVariable Long courseCode);

    @GetMapping("/api/course/{courseCode}/grade")
    CourseGradeDTO getGradesByCourseCode(@PathVariable Long courseCode);

    @GetMapping("/api/grade/{id}")
    GradeDTO getGradeById(@PathVariable Long id);
}
