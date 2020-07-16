package com.example.demo.repository;

import com.example.demo.entity.Recruit_Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RecRepository extends JpaRepository<Recruit_Info,Integer> {
    @Query(value = "select * from recruit_info",nativeQuery = true)
    List<Recruit_Info> get_jobs();

    @Query(value="select * from recruit_info where" +
            " substring_index(Rec_Salary,'-',1)>=?1 and substring_index(Rec_Salary,'-',-1) <=?2" +
            " and Rec_Cate like CONCAT('%',?3,'%') and Rec_Location like CONCAT('%',?4,'%') and Rec_Title like CONCAT('%',?5,'%')" +
            " and Rec_Experience like CONCAT('%',?6,'%') and Rec_education like CONCAT('%',?7,'%')",nativeQuery = true)
    List<Recruit_Info> filt_jobs(String lowsalary,String highsalary,String cate,String location,String title,String experience,String education);
}
