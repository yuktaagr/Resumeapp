package com.assessment.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.entity.Skills;

public interface SkillsRepo extends JpaRepository<Skills, String> {

}
