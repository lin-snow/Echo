package ch.soopy.echo.mapper;

import cn.soopy.echo.dto.ItemPageQueryDTO;
import cn.soopy.echo.entity.Message;
import cn.soopy.echo.vo.ItemVO;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MessageMapper {

    /**
     * 添加留言
     * @param message
     */
    @Insert("INSERT INTO message (user_id, content, create_time) VALUES (#{userId}, #{content}, #{createTime})")
    void add(Message message);

    /**
     * 留言分页查询
     * @param itemPageQueryDTO
     * @return
     */
    Page<ItemVO> pageQuery(ItemPageQueryDTO itemPageQueryDTO);
}
