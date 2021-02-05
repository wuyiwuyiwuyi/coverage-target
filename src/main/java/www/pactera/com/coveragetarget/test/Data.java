package www.pactera.com.coveragetarget.test;

import java.util.Arrays;

public class Data {



    private String fileType;

    private String file;

    private String filePath;

    private String coverageNum;

    private String coverageRate;


    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getCoverageNum() {
        return coverageNum;
    }

    public void setCoverageNum(String coverageNum) {
        this.coverageNum = coverageNum;
    }

    public String getCoverageRate() {
        return coverageRate;
    }

    public void setCoverageRate(String coverageRate) {
        this.coverageRate = coverageRate;
    }

    public Data(Data[] children, String fileType, String file, String filePath, String coverageNum, String coverageRate) {
        this.fileType = fileType;
        this.file = file;
        this.filePath = filePath;
        this.coverageNum = coverageNum;
        this.coverageRate = coverageRate;
    }

    public Data() {

    }

    @Override
    public String toString() {
        return "Data{" +
                ", fileType='" + fileType + '\'' +
                ", file='" + file + '\'' +
                ", filePath='" + filePath + '\'' +
                ", coverageNum='" + coverageNum + '\'' +
                ", coverageRate='" + coverageRate + '\'' +
                '}';
    }
}
