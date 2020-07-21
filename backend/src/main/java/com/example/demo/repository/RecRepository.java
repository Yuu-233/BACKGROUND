package com.example.demo.repository;

import com.example.demo.entity.Recruit_Info;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface RecRepository extends JpaRepository<Recruit_Info,Integer> {
    @Query(value = "select * from recruit_info",nativeQuery = true)
    List<Recruit_Info> get_jobs();

    @Query(value="select * from recruit_info where" +
            " substring_index(Rec_Salary,'-',1)>=?1 and substring_index(Rec_Salary,'-',-1) <=?2" +
            " and Rec_Cate like CONCAT('%',?3,'%') and Rec_Location like CONCAT('%',?4,'%') and Rec_Title like CONCAT('%',?5,'%')" +
            " and Rec_Experience like CONCAT('%',?6,'%') and Rec_education like CONCAT('%',?7,'%')",nativeQuery = true)
    List<Recruit_Info> filt_jobs(String lowsalary,String highsalary,String cate,String location,String title,String experience,String education);

    @Query(value="select * from recruit_info where" +
            "  Rec_Cate like CONCAT('%',?1,'%') and Rec_Location like CONCAT('%',?2,'%') and Rec_Title like CONCAT('%',?3,'%')" +
            " and Rec_Experience like CONCAT('%',?4,'%') and Rec_education like CONCAT('%',?5,'%')",nativeQuery = true)
    List<Recruit_Info> filt_jobs_without_salary(String cate,String location,String title,String experience,String education);

    @Transactional
    @Modifying
    @Query(value="insert into recruit_info(User_ID,Rec_salary,Rec_Location,Rec_TimeSchedule,Rec_Title,Rec_Cate,Rec_Quota,Rec_Desc,Rec_Experience,Rec_Education) " +
                                  " values(?1,?2,?3,?4,?5,?6,0,?7,?8,?9,?10)",nativeQuery = true)
    void create_job(Integer userid,String salary,String location,String schedule,String title,String cate,Integer quota,String desc,String exp,String edu);

    @Query(value="select * from Recruit_Info where User_ID = ?",nativeQuery = true)
    List<Recruit_Info> getRecbyId(Integer userid);

    @Modifying
    @Query("delete from Recruit_Info b where b.Rec_ID=:rec_id")
    void deleteByRec_ID(@Param("rec_id") int rec_id);
    @Modifying
    @Query("select b from Recruit_Info b where b.Rec_ID=:rec_id")
    Recruit_Info findByRec_ID(@Param("rec_id") int rec_id);

}
