package com.roytest.repositories;

import com.roytest.beans.Grade;
import org.springframework.data.jpa.repository.JpaRepository;


public interface GradeRepo extends JpaRepository<Grade,Long> {
}
