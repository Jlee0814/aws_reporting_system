package com.antra.evaluation.reporting_system.repo;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

import com.antra.evaluation.reporting_system.pojo.report.PDFFile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class PDFRepo {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;


    public void save(PDFFile pdfFile) {
        System.out.println(dynamoDBMapper);
        dynamoDBMapper.save(pdfFile);
    }

}
