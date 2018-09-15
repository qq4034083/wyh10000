package com.qfdu.user.mapper;

import com.qfedu.domain.User;

public interface UserMapper {

    int insert(User record);

    User selectByName(String name);

}