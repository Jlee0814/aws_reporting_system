## What has been done so far
#### 1. Set up a event trigger & dead-letter-queue for email queue to hanlde messages that can't be delivered to subscribers successfully
#### 2. Migrated MongoDB to DynamoDB in PDFService， Change H2 to Mysql in CientService
#### 3. Added new features, such as delete API, update API
#### 4.	configured Netflix Eureka to enable service failover enhance service fault tolerance
#### 5. Integrated with OpenFeign to communicate(declarative service call) between service instead of using RestTemplate also enabled Ribbon to achieve client-side load balance
#### 6. implemented fallback classes work with Hystrix avoid cascade service failure.
#### 7. Add customized GlobalExceptionHandler by using @ControllerAdvice and @ExceptionHandler worked with implemented user-defined exception classes
#### 8. Used Parallel Stream to improve sync API performance by sending request concurrently
#### 9. Reduced code redundancy and duplication
 

