package xyz.macsen.common.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import xyz.macsen.common.enums.ExceptionEnum;
import xyz.macsen.common.exception.BlogException;
import xyz.macsen.common.vo.ExceptionResult;
import xyz.macsen.common.vo.Result;

@ControllerAdvice
@RestController
public class CommonExceptionHandler {

    @ExceptionHandler(BlogException.class)
    public Result<ExceptionResult> handleException(BlogException e) {
        ExceptionEnum em = e.getExceptionEnum();
        return new Result<ExceptionResult>(false,  em.getCode(), em.getMessage(), new ExceptionResult(e.getExceptionEnum()));
    }
}
