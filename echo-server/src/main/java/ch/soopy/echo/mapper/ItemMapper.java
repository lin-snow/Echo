package ch.soopy.echo.mapper;


import cn.soopy.echo.dto.ItemDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ItemMapper {
    /**
     * 添加留言
     * @param itemDTO
     */
    void add(ItemDTO itemDTO);
}
