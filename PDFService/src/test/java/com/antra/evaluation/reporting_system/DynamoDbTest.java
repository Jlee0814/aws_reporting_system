package com.antra.evaluation.reporting_system;

import com.antra.evaluation.reporting_system.pojo.report.PDFFile;
import com.antra.evaluation.reporting_system.repo.PDFRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

public class DynamoDbTest {

//    AwsService awsService = new AwsService();
//
//        awsService.setServiceName("AWS DynamoDB");
//        awsService.setServiceHomePageUrl("https://aws.amazon.com/dynamodb/?nc2=h_m1");

    @Autowired
    private PDFRepo repo;
    @Test
    public void test(){
        System.out.println(repo);
        PDFFile pdfFile = new PDFFile();
        pdfFile.setId("1");
        pdfFile.setDescription("xxx");
        pdfFile.setFileLocation("ewerewre");
        pdfFile.setFileName("xxxx");
        pdfFile.setFileSize((long)123);
        pdfFile.setGeneratedTime(LocalDateTime.now());
        pdfFile.setSubmitter("xxxxx");
        //repo.save(pdfFile);
    }
}
