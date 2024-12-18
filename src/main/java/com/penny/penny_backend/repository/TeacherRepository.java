package com.penny.penny_backend.repository;

import com.penny.penny_backend.domain.Job;
import com.penny.penny_backend.domain.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
