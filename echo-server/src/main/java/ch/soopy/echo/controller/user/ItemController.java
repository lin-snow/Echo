package ch.soopy.echo.controller.user;


import ch.soopy.echo.service.MessageService;
import ch.soopy.echo.service.UserService;
import cn.soopy.echo.dto.ItemDTO;
import cn.soopy.echo.dto.ItemPageQueryDTO;
import cn.soopy.echo.result.PageResult;
import cn.soopy.echo.result.Result;
import cn.soopy.echo.vo.ItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user/item")
public class ItemController {

    @Autowired
    private UserService userService;
    @Autowired
    private MessageService messageService;

    /**
     * 添加留言
     * @param itemDTO
     * @return
     */
    @PostMapping("/addItem")
    public Result addItem(@RequestBody ItemDTO itemDTO) {
        userService.addItem(itemDTO);
        return Result.success();
    }

    @GetMapping("/page")
    public Result<PageResult<ItemVO>> listItem(@RequestBody ItemPageQueryDTO itemPageQueryDTO) {
        PageResult<ItemVO> pageResult = messageService.listItem(itemPageQueryDTO);
        return Result.success(pageResult);
    }
}
