package com.antra.report.client.feign.fallback;

import com.antra.report.client.feign.PdfClient;
import com.antra.report.client.pojo.reponse.PDFResponse;
import com.antra.report.client.pojo.request.ReportRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class PdfClientFallBack implements PdfClient {
    private static final Logger log = LoggerFactory.getLogger(PdfClientFallBack.class);
    @Override
    public ResponseEntity<PDFResponse> createPDF(ReportRequest request) {
        log.info("can not request to generate PDF: {}", request);

        return new ResponseEntity<>(HttpStatus.EXPECTATION_FAILED);
    }
}
