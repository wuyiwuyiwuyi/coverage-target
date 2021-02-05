package www.pactera.com.coveragetarget.common.Dto;

public class MergeCoverageRespDTO {
    /**
     * 报告文件的路径
     */
    private String reportFilePath;

    /**
     * 覆盖率收集结果
     */
    private String result;

    public String getReportFilePath() {
        return reportFilePath;
    }

    public void setReportFilePath(String reportFilePath) {
        this.reportFilePath = reportFilePath;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public MergeCoverageRespDTO(String reportFilePath, String result) {
        this.reportFilePath = reportFilePath;
        this.result = result;
    }

    public MergeCoverageRespDTO() {

    }

}
