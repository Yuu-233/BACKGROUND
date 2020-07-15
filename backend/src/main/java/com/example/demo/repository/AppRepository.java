package com.example.demo.repository;

import com.example.demo.entity.Apply_Info;
import com.example.demo.entity.Recruit_Info;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRepository extends JpaRepository<Apply_Info,Integer> {
}
