package cn.soopy.echo.exception;

/**
 * 业务异常
 */
public class BaseException extends RuntimeException {

    public BaseException() {
    }

    public BaseException(String msg) {
        super(msg);
    }

}
