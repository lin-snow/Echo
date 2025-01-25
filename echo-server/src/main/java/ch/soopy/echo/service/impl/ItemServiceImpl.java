package ch.soopy.echo.service.impl;

import ch.soopy.echo.mapper.ItemMapper;
import ch.soopy.echo.service.ItemService;
import cn.soopy.echo.dto.ItemDTO;
import cn.soopy.echo.entity.Message;
import cn.soopy.echo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    ItemMapper itemMapper;

    /**
     * 添加留言
     * @param itemDTO
     */
    public void addItem(ItemDTO itemDTO) {
        if (itemDTO == null) {
            return;
        }
        Message message = Message.builder()
                .content(itemDTO.getContent())
                .build();

        User user = User.builder()
                .name(itemDTO.getName())
                .email(itemDTO.getEmail())
                .build();


    }
}
