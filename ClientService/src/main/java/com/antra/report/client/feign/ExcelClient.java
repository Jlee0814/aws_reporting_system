package com.antra.report.client.feign;


import com.antra.report.client.feign.fallback.ExcelClientFallBack;
import com.antra.report.client.pojo.reponse.ExcelResponse;
import com.antra.report.client.pojo.request.ReportRequest;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Primary
@FeignClient(value="EXCELSERVICE",url = "localhost:8888",fallback = ExcelClientFallBack.class)
public interface ExcelClient {
    @PostMapping("/excel")
    public ResponseEntity<ExcelResponse> createExcel(@RequestBody @Validated ReportRequest request);
}
