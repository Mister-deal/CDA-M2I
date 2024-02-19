package com.example.demo.controller;



import com.example.demo.exception.CustomException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//@RestControllerAdvice
@ControllerAdvice
public class ExceptionRestController {


    @ResponseBody
    @ExceptionHandler(ArithmeticException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String handleArithmeticException(ArithmeticException ex){
        return "Oups il semblerai qu'on est un probléme de math (je suis dans le rest controller advice) "+ ex.getMessage();
    }

    @ResponseBody
    @ExceptionHandler(CustomException.class)
   // @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String customExceptionHandler(CustomException ex){
        return "Oups il semblerai qu'on est un probléme custom (je suis dans le rest controller advice) "+ ex.getMessage();
    }

}
