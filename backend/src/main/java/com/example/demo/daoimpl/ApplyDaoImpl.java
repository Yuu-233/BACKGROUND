package com.example.demo.daoimpl;

import com.example.demo.dao.ApplyDao;
import com.example.demo.repository.ApplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ApplyDaoImpl implements ApplyDao {
    @Autowired
    private ApplyRepository applyRepository;

    @Override
    public void add_apply_info(Integer user_id,Integer rec_id){
        applyRepository.add_apply_info(user_id,rec_id);
    }

    @Override
    public List<Object> getAppbyId(Integer userid){return applyRepository.getAppbyId(userid);}
}
