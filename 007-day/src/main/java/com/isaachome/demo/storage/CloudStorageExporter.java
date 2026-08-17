package com.isaachome.demo.storage;

public interface CloudStorageExporter {
    void upload(String fileName,byte[] data);
    default void uploadWithBackup(String fileName,byte[] data){
        System.out.println("Backing up file before upload");
        upload(fileName,data);
    }
}
