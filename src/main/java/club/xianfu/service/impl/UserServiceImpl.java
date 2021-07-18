package club.xianfu.service.impl;

import club.xianfu.mapper.UserMapper;
import club.xianfu.model.entity.User;
import club.xianfu.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<User> findAll() {
        return userMapper.selectList(new QueryWrapper<User>().gt("id","23"));
    }
}
