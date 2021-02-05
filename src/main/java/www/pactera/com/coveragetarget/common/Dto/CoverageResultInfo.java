package www.pactera.com.coveragetarget.common.Dto;

import www.pactera.com.coveragetarget.common.BaseEntity.BaseDTO;

public class CoverageResultInfo extends BaseDTO {
    /**
     * 服务名称
     */
    private String serverName;
    /**
     * 版本号
     */
    private String versionNum;
    /**
     * 状态
     */
    private String status;
    /**
     * 阶段
     */
    private String phase;
    /**
     * 时间范围
     */
    private String time;
    /**
     * 操作人
     */
    private String handleUser;
    /**
     * 业务方向
     */
    private String businessDirection;
    /**
     * 覆盖率
     */
    private String coverageRate;
    /**
     * 总行数
     */
    private String totalLineNumber;
    /**
     * 报告的地址链接
     */
    private String reportUrlLike;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhase() {
        return phase;
    }

    public void setPhase(String phase) {
        this.phase = phase;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHandleUser() {
        return handleUser;
    }

    public void setHandleUser(String handleUser) {
        this.handleUser = handleUser;
    }

    public String getBusinessDirection() {
        return businessDirection;
    }

    public void setBusinessDirection(String businessDirection) {
        this.businessDirection = businessDirection;
    }

    public String getCoverageRate() {
        return coverageRate;
    }

    public void setCoverageRate(String coverageRate) {
        this.coverageRate = coverageRate;
    }

    public String getTotalLineNumber() {
        return totalLineNumber;
    }

    public void setTotalLineNumber(String totalLineNumber) {
        this.totalLineNumber = totalLineNumber;
    }

    public String getReportUrlLike() {
        return reportUrlLike;
    }

    public void setReportUrlLike(String reportUrlLike) {
        this.reportUrlLike = reportUrlLike;
    }

    public CoverageResultInfo(String serverName, String versionNum, String status, String phase, String time, String handleUser, String businessDirection, String coverageRate, String totalLineNumber, String reportUrlLike) {
        this.serverName = serverName;
        this.versionNum = versionNum;
        this.status = status;
        this.phase = phase;
        this.time = time;
        this.handleUser = handleUser;
        this.businessDirection = businessDirection;
        this.coverageRate = coverageRate;
        this.totalLineNumber = totalLineNumber;
        this.reportUrlLike = reportUrlLike;
    }

    public CoverageResultInfo(){

    }

    @Override
    public String toString() {
        return "CoverageResultInfo{" +
                "serverName='" + serverName + '\'' +
                ", versionNum='" + versionNum + '\'' +
                ", status='" + status + '\'' +
                ", phase='" + phase + '\'' +
                ", time='" + time + '\'' +
                ", handleUser='" + handleUser + '\'' +
                ", businessDirection='" + businessDirection + '\'' +
                ", coverageRate='" + coverageRate + '\'' +
                ", totalLineNumber='" + totalLineNumber + '\'' +
                ", reportUrlLike='" + reportUrlLike + '\'' +
                '}';
    }
}
