package club.xianfu.mapper;

import club.xianfu.model.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper

public interface UserMapper extends BaseMapper<User> {


//    @Select("select * from users")
//List<User> findAll();


}
