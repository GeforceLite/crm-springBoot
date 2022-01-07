package com.cc.crm.settings.dao;

import com.cc.crm.settings.domain.User;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;
import java.util.Map;

public interface UserDao {
    User login(Map<String, Object> map);

    List<User> getUserList();
}
