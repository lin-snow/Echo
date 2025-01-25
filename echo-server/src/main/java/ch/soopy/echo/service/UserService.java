package ch.soopy.echo.service;

import cn.soopy.echo.dto.ItemDTO;

public interface UserService {

    /**
     * 添加留言
     * @param itemDTO
     */
    void addItem(ItemDTO itemDTO);
}
