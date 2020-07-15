package com.example.demo.repository;

import com.example.demo.entity.Apply_Info;
import com.example.demo.entity.Recruit_Info;
import com.example.demo.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ResumeRepository extends JpaRepository<Resume,Integer> {
    @Query(value="select * from resume",nativeQuery = true)
    List<Resume> get_applicants();
}
