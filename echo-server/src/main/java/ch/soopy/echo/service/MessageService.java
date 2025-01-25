package ch.soopy.echo.service;

import cn.soopy.echo.dto.ItemPageQueryDTO;
import cn.soopy.echo.result.PageResult;
import cn.soopy.echo.vo.ItemVO;

public interface MessageService {

    /**
     * 留言分页查询
     * @return
     */
    PageResult<ItemVO> listItem(ItemPageQueryDTO itemPageQueryDTO);
}
