package com.example.demo.daoimpl;

import com.example.demo.dao.ApplyDao;
import com.example.demo.entity.Apply_Info;
import com.example.demo.repository.ApplyRepository;
import com.example.demo.service.ApplyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ApplyDaoImpl implements ApplyDao {
    @Autowired
    private ApplyRepository applyRepository;

    @Override
    public void add_apply_info(Integer user_id,Integer rec_id){
        applyRepository.add_apply_info(user_id,rec_id);
    }
    @Override
    public void delete_apply_info(Integer user_id,Integer rec_id){
        applyRepository.delete_apply_info(user_id,rec_id);
    }

    @Override
    public void update_apply_info(Integer user_id,Integer rec_id, Integer accepted ){
        applyRepository.update_apply_info(user_id,rec_id,accepted);
    }
}
