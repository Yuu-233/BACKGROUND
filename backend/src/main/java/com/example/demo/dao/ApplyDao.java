package com.example.demo.dao;

import java.util.List;

public interface ApplyDao {
    public void add_apply_info(Integer user_id,Integer rec_id);
    public List<Object> getAppbyId(Integer userid);
}
