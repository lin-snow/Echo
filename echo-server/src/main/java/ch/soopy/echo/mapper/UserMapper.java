package ch.soopy.echo.mapper;

import cn.soopy.echo.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {
    /**
     * 添加用户
     * @param user
     */
    void add(User user);

    /**
     * 根据用户信息获取用户
     * @param user
     * @return
     */
    User getUserByInfo(User user);
}
