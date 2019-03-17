package com.liu.config;

/**异常类
 * @author LiuJiangFeng
 * @ClassName: UnableToAquireLockException
 * @Date 2019/3/17 21:15
 */
public class UnableToAquireLockException extends RuntimeException  {

    public UnableToAquireLockException() {
    }

    public UnableToAquireLockException(String message) {
        super(message);
    }

    public UnableToAquireLockException(String message, Throwable cause) {
        super(message, cause);
    }
}
