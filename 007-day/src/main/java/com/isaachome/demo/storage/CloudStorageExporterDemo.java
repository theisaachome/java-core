package com.isaachome.demo.storage;

public class CloudStorageExporterDemo {
    static void main() {
        var s3StorageExporter = new S3StorageExporter("my-bucket", "us-east-1", "access-key", "secret-key");
        s3StorageExporter.upload("my-file.txt", "Hello, World!".getBytes());
        s3StorageExporter.uploadWithBackup("my-file-backup.txt", "Hello, World!".getBytes());


        var googleStorage = new GoogleCloudStorageExporter("myPicture");
        googleStorage.upload("my-file.txt", "Hello, World!".getBytes());
    }
}
