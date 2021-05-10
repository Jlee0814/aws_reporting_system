package com.antra.report.client.feign.fallback;

import com.antra.report.client.feign.ExcelClient;
import com.antra.report.client.pojo.reponse.ExcelResponse;
import com.antra.report.client.pojo.request.ReportRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ExcelClientFallBack implements ExcelClient {
    private static final Logger log = LoggerFactory.getLogger(ExcelClientFallBack.class);
    @Override
    public ResponseEntity<ExcelResponse> createExcel(ReportRequest request) {
        log.debug("Can not create Excel", request);
        return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }
}
