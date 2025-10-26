package com.isaachome;

import java.util.Date;
import java.util.List;

public class GeneralInformation {

    private long startAt;
    private long endAt;
    private String status;
    private Date referenceDate;
    private List<FileInformation> fileInformationList;

}

class FileInformation {
    private String fileName;
    private String filePath;
    private long totalRecords;
    private Date importedDate;
}