package com.isaachome.demo.storage;

public class S3StorageExporter implements CloudStorageExporter{
    private String bucketName;
    private String region;
    private String accessKey;
    private String secretKey;

    public S3StorageExporter(String bucketName, String region, String accessKey, String secretKey) {
        this.bucketName = bucketName;
        this.region = region;
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    @Override
    public void upload(String fileName, byte[] data) {
        // logic to upload to S3
        System.out.printf("Login to S3: meta: Bucket %s region %s AccessKey %s secretKey %s",bucketName,region,accessKey,secretKey);
        // upload to S3
        System.out.println("Uploading to S3: " + fileName);
    }

    public String getBucketName() {
        return bucketName;
    }

    public String getRegion() {
        return region;
    }

    public String getAccessKey() {
        return accessKey;
    }

    public String getSecretKey() {
        return secretKey;
    }
}
