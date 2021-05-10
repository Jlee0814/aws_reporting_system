package com.antra.report.client.feign;

import com.antra.report.client.feign.fallback.PdfClientFallBack;
import com.antra.report.client.pojo.reponse.PDFResponse;
import com.antra.report.client.pojo.request.ReportRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@Primary
@FeignClient(value="PDFSERVICE",url = "localhost:9999",fallback = PdfClientFallBack.class)
public interface PdfClient {
    @PostMapping("/pdf")
    public ResponseEntity<PDFResponse> createPDF(@RequestBody @Validated ReportRequest request);
}
