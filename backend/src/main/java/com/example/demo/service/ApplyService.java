package com.example.demo.service;

public interface ApplyService {
    public void add_apply_info(Integer user_id,Integer rec_id);
    public void delete_apply_info(Integer user_id,Integer rec_id);
    public void update_apply_info(Integer user_id,Integer rec_id, Integer accepted);

}
