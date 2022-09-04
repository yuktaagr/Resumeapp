package com.assessment.service;

import com.assessment.repo.EduRepo;
import com.assessment.repo.ProjectRepo;
import com.assessment.repo.SkillsRepo;
import com.assessment.repo.UserRepo;
import com.assessment.entity.Education;
import com.assessment.entity.Projects;
import com.assessment.entity.Skills;
import com.assessment.entity.PersonalDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MainService {
    @Autowired
    public UserRepo userRepo;
    @Autowired
    public ProjectRepo projectRepo;
    @Autowired
    public EduRepo eduRepo;
    @Autowired
    public SkillsRepo skillRepo;

    public void showUser(PersonalDetails user) {
        PersonalDetails olduser = userRepo.findById("1").get();
        if(!Objects.equals(user.getName(), null))
            olduser.setName(user.getName());
        if(!Objects.equals(user.getEmail(), null))
            olduser.setEmail(user.getEmail());
        if(!Objects.equals(user.getphoneNumber(), null))
            olduser.setphoneNumber(user.getphoneNumber());
        
        userRepo.save(olduser);
    }

    public PersonalDetails getUser(){
        return userRepo.findAll().get(0);
    }

    public List<Projects> getProjects(){
        return projectRepo.findAll();
    }

    public List<Education> getEdu(){
        return eduRepo.findAll();
    }
    public Skills getSkills(){
        return skillRepo.findAll().get(0);
    }
}
