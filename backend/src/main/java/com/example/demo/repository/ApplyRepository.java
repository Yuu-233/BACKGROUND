package com.example.demo.repository;

import com.example.demo.entity.Apply_Info;
import com.example.demo.entity.CompositePK.Apply_InfoPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;

public interface ApplyRepository extends JpaRepository<Apply_Info, Apply_InfoPK>
{
    @Transactional
    @Modifying
    @Query(value="insert into apply_info(User_ID,Rec_ID,Accepted) values(?1,?2,0)",nativeQuery = true)
    public void add_apply_info(Integer user_id,Integer rec_id);

    @Transactional
    @Modifying
    @Query(value="delete from Apply_info(User_ID,Rec_ID,Accepted) b where b.User_ID =: user_id and b.Rec_ID =: rec_id", nativeQuery = true)
    public void delete_apply_info(Integer user_id,Integer rec_id);

    @Transactional
    @Modifying
    @Query(value="update apply_info (User_ID,Rec_ID,Accepted)  set Accepted=:accepted where User_ID =: user_id and Rec_ID =:rec_id", nativeQuery = true )
    public void update_apply_info(Integer user_id,Integer rec_id,Integer accepted);


}
