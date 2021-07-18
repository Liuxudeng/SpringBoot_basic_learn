package club.xianfu.model.entity;

import club.xianfu.mapper.UserMapper;
import lombok.Data;

@Data
public class User  {

    private int id;
    private String username;
    private String address;
    private String email;
}
