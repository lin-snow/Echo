package ch.soopy.echo.service.impl;

import ch.soopy.echo.mapper.MessageMapper;
import ch.soopy.echo.mapper.UserMapper;
import ch.soopy.echo.service.UserService;
import cn.soopy.echo.constant.MessageConstant;
import cn.soopy.echo.dto.ItemDTO;
import cn.soopy.echo.entity.Message;
import cn.soopy.echo.entity.User;
import cn.soopy.echo.exception.BaseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    MessageMapper messageMapper;

    /**
     * 添加留言
     * @param itemDTO
     */
    public void addItem(ItemDTO itemDTO) {
        if (itemDTO == null || itemDTO.getName() == null || itemDTO.getName().isEmpty()) {
            throw new BaseException(MessageConstant.EMPTY_NAME);
        }
        Message message = Message.builder()
                .content(itemDTO.getContent())
                .createTime(LocalDateTime.now())
                .build();

        User user = User.builder()
                .name(itemDTO.getName())
                .email(itemDTO.getEmail())
                .createTime(LocalDateTime.now())
                .build();

        User userByInfo = userMapper.getUserByInfo(user);
        if (userByInfo == null) {
            userMapper.add(user);
        } else {
            user.setId(userByInfo.getId());
            user.setCreateTime(userByInfo.getCreateTime());
        }
        message.setUserId(user.getId());
        messageMapper.add(message);
    }
}
