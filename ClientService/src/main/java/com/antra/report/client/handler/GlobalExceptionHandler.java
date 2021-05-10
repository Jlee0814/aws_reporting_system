package com.antra.report.client.handler;


import com.antra.report.client.exception.ReportException;
import com.antra.report.client.pojo.reponse.ErrorResponse;
import com.antra.report.client.pojo.reponse.GeneralResponse;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice// Spring AOP
public class GlobalExceptionHandler {
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ExceptionHandler(BadSqlGrammarException.class)
    @ResponseBody
    public ResponseEntity<GeneralResponse>error(BadSqlGrammarException e){

        log.error(ExceptionUtils.getMessage(e));
        return new ResponseEntity<>(new ErrorResponse(HttpStatus.BAD_REQUEST, e.getMessage()), HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseBody
    public ResponseEntity<GeneralResponse> error(HttpMessageNotReadableException e){

        log.error(ExceptionUtils.getMessage(e));
        return new ResponseEntity<>(new ErrorResponse(HttpStatus.NOT_ACCEPTABLE, e.getMessage()), HttpStatus.NOT_ACCEPTABLE);

    }
    @ExceptionHandler(ReportException.class)//
    @ResponseBody
    public ResponseEntity<GeneralResponse> error(ReportException e){

        log.error(ExceptionUtils.getMessage(e));
        return new ResponseEntity<>(new ErrorResponse(HttpStatus.EXPECTATION_FAILED, e.getMessage()), HttpStatus.EXPECTATION_FAILED);

    }
    //    @ExceptionHandler(Exception.class)
//   @ResponseBody
//        public ResponseEntity<GeneralResponse> error(Exception e){
//            String errorMsg = e.getMessage();
//            log.error(ExceptionUtils.getMessage(e));
//            return new ResponseEntity<>(new ErrorResponse(HttpStatus.EXPECTATION_FAILED, errorMsg), HttpStatus.EXPECTATION_FAILED);
//    }
}
