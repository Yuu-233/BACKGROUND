package com.example.demo.service;

import com.example.demo.utils.CompleteApplyInfo;

import java.util.List;

public interface ApplyService {
    public void add_apply_info(Integer user_id,Integer rec_id);

    public List<CompleteApplyInfo> getAppbyId(Integer userid);

    public void delete_apply_info(Integer user_id,Integer rec_id);
    public void update_apply_info(Integer user_id,Integer rec_id, Integer accepted);


}
