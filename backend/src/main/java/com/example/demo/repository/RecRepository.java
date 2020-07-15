package com.example.demo.repository;

import com.example.demo.entity.Recruit_Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecRepository extends JpaRepository<Recruit_Info,Integer> {
    @Query(value = "select * from recruit_info",nativeQuery = true)
    List<Recruit_Info> get_jobs();
}
