package com.antra.evaluation.reporting_system.service;//package com.antra.evaluation.reporting_system.service;
//
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
//import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
//import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
//import com.amazonaws.services.dynamodbv2.util.TableUtils;
//import com.antra.evaluation.reporting_system.pojo.report.AwsService;
//import com.antra.evaluation.reporting_system.repo.AwsServiceRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//
//import java.util.Optional;
//
//public class dynamoService {
//    private DynamoDBMapper dynamoDBMapper;
//
//    @Autowired
//    private AmazonDynamoDB amazonDynamoDB;
//
//    @Autowired
//    private AwsServiceRepository awsServiceRepository;
//
//    public dynamoService(){
//
//        dynamoDBMapper = new DynamoDBMapper(amazonDynamoDB);
//
//        CreateTableRequest tableRequest = dynamoDBMapper
//                .generateCreateTableRequest(AwsService.class);
//
//        tableRequest.setProvisionedThroughput(
//                new ProvisionedThroughput(1L, 1L));
//
//        TableUtils.createTableIfNotExists(amazonDynamoDB, tableRequest);
//    }
//    public void persist(AwsService awsService){
//
//        awsService = awsServiceRepository.save(awsService);
//        System.out.println(awsService.getServiceName());
//
//    }
//}
