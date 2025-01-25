package ch.soopy.echo.service;

import cn.soopy.echo.dto.ItemDTO;

public interface ItemService {

    /**
     * 添加留言
     * @param itemDTO
     */
    void addItem(ItemDTO itemDTO);
}
