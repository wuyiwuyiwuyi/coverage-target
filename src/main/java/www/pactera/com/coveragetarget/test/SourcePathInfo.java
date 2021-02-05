package www.pactera.com.coveragetarget.test;

public class SourcePathInfo {

    private String packagePath;

    private String coverLine;

    private String totalLineNumber;

    private String sourceCoverageRate;

    public String getPackagePath() {
        return packagePath;
    }

    public void setPackagePath(String packagePath) {
        this.packagePath = packagePath;
    }

    public String getCoverLine() {
        return coverLine;
    }

    public void setCoverLine(String coverLine) {
        this.coverLine = coverLine;
    }

    public String getTotalLineNumber() {
        return totalLineNumber;
    }

    public void setTotalLineNumber(String totalLineNumber) {
        this.totalLineNumber = totalLineNumber;
    }

    public String getSourceCoverageRate() {
        return sourceCoverageRate;
    }

    public void setSourceCoverageRate(String sourceCoverageRate) {
        this.sourceCoverageRate = sourceCoverageRate;
    }

    public SourcePathInfo(String packagePath, String coverLine, String totalLineNumber, String sourceCoverageRate) {
        this.packagePath = packagePath;
        this.coverLine = coverLine;
        this.totalLineNumber = totalLineNumber;
        this.sourceCoverageRate = sourceCoverageRate;
    }


    public SourcePathInfo() {

    }


    @Override
    public String toString() {
        return "SourcePathInfo{" +
                "packagePath='" + packagePath + '\'' +
                ", coverLine='" + coverLine + '\'' +
                ", totalLineNumber='" + totalLineNumber + '\'' +
                ", sourceCoverageRate='" + sourceCoverageRate + '\'' +
                '}';
    }
}
