package ch.soopy.echo.controller.user;


import ch.soopy.echo.service.ItemService;
import cn.soopy.echo.dto.ItemDTO;
import cn.soopy.echo.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/user/item")
public class ItemController {

    @Autowired
    ItemService itemService;

    /**
     * 添加留言
     * @param itemDTO
     * @return
     */
    @PostMapping("")
    public Result addItem(@RequestBody ItemDTO itemDTO) {
        itemService.addItem(itemDTO);
        return Result.success();
    }
}
