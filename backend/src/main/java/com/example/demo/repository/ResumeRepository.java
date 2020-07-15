package com.example.demo.repository;

import com.example.demo.entity.Apply_Info;
import com.example.demo.entity.Recruit_Info;
import com.example.demo.entity.Resume;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.ManyToMany;
import javax.transaction.Transactional;
import java.util.List;

public interface ResumeRepository extends JpaRepository<Resume,Integer> {
    @Query(value="select * from resume",nativeQuery = true)
    List<Resume> get_applicants();

    @Query(value="select User_ID from resume where User_ID = ?",nativeQuery = true)
    Integer checkUserbyId(Integer user_id);

    @Transactional
    @Modifying
    @Query(value="insert into resume(User_ID,Name,Gender,Birth,Experience,Education) values(?,?,?,?,?,?)",nativeQuery = true)
    void add_resume(Integer user_id, String name, Boolean gender,String birth,String experience,String education);

    @Transactional
    @Modifying
    @Query(value="update resume set Name=?2,Gender=?3,Birth=?4,Experience=?5,Education=?6 where User_ID=?1",nativeQuery = true)
    void alter_resume(Integer user_id, String name, Boolean gender,String birth,String experience,String education);

    @Query(value="select * from resume where Experience = ?1 and Education = ?2",nativeQuery = true)
    List<Resume> filt_applicants(String experience,String education);
}
