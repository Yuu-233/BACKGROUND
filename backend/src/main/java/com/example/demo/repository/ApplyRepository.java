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

    @Query(value="select * from recruit_info natural join apply_info where User_ID = ?",nativeQuery = true)
    public List<Object> getAppbyId(Integer userid);
}
