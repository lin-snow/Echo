package ch.soopy.echo.service.impl;

import ch.soopy.echo.mapper.MessageMapper;
import ch.soopy.echo.service.MessageService;
import cn.soopy.echo.dto.ItemPageQueryDTO;
import cn.soopy.echo.result.PageResult;
import cn.soopy.echo.vo.ItemVO;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MessageServiceImpl implements MessageService {

    @Autowired
    MessageMapper messageMapper;

    /**
     * 留言分页查询
     * @return
     */
    public PageResult<ItemVO> listItem(ItemPageQueryDTO itemPageQueryDTO) {
        log.info("分页查询: {}", itemPageQueryDTO);
        PageHelper.startPage(itemPageQueryDTO.getPage(), itemPageQueryDTO.getPageSize());
        Page<ItemVO> page = messageMapper.pageQuery(itemPageQueryDTO);
        return new PageResult<ItemVO>(page.getTotal(), page.getResult());
    }
}
