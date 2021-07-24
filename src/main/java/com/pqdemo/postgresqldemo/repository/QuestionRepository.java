package com.pqdemo.postgresqldemo.repository;

import com.pqdemo.postgresqldemo.models.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question,Long> {

}
