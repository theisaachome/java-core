package com.isaachome.demo.storage;

public class GoogleCloudStorageExporter implements CloudStorageExporter{
    private String bucketName;

    public GoogleCloudStorageExporter(String bucketName) {
        this.bucketName = bucketName;
    }

    @Override
    public void upload(String fileName, byte[] data) {
        System.out.println("Uploading to Google Cloud Storage: " + fileName);
    }
}
