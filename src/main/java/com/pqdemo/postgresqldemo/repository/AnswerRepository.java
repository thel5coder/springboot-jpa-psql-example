package com.pqdemo.postgresqldemo.repository;

import com.pqdemo.postgresqldemo.models.Answer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnswerRepository extends JpaRepository<Answer,Long> {
    List<Answer> findByQuestionId(Long questionId);
}
