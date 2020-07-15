package com.example.demo.repository;

import com.example.demo.entity.Recruit_Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecRepository extends JpaRepository<Recruit_Info,Integer> {
}
