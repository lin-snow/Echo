package ch.soopy.echo.handler;

import cn.soopy.echo.exception.BaseException;
import cn.soopy.echo.result.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler
    public Result exceptionHandler(BaseException ex) {
        log.error("异常信息: {}", ex.getMessage());
        return Result.error(ex.getMessage());
    }
}
