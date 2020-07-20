package com.example.demo.repository;

import com.example.demo.entity.Apply_Info;
import com.example.demo.entity.CompositePK.Apply_InfoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface ApplyRepository extends JpaRepository<Apply_Info, Apply_InfoPK>
{
    @Transactional
    @Modifying
    @Query(value="insert into apply_info(User_ID,Rec_ID,Accepted) values(?1,?2,0)",nativeQuery = true)
    public void add_apply_info(Integer user_id,Integer rec_id);

    @Query(value= "select *\n" +
                  "from\n" +
                  "(select Rec_ID ,Rec_Salary,Rec_Location,Rec_TimeSchedule,Rec_Title,Rec_Cate,Rec_Enrolled,Rec_Quota,Rec_Desc,Rec_Experience,Rec_Education,Tags from recruit_info where recruit_info.Rec_ID in (select apply_info.Rec_ID from apply_info where apply_info.User_ID = ?1)) as R\n" +
                  "natural join apply_info",nativeQuery = true)
    public List<Object> getAppbyId(Integer userid);

    @Transactional
    @Modifying
    @Query(value="delete from Apply_info b where b.User_ID=:user_id and b.Rec_ID=:rec_id", nativeQuery = true)
    public void delete_apply_info(Integer user_id,Integer rec_id);

    @Transactional
    @Modifying
    @Query(value="update apply_info  set Accepted=?3 where User_ID =?1 and Rec_ID =?2", nativeQuery = true )
    public void update_apply_info(Integer user_id,Integer rec_id,Integer accepted);

}
