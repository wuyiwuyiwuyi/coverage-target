package www.pactera.com.coveragetarget.common.Dto;

public class ProjectBaseInfo {
    /**
     * 服务名称
     */
    private String projectName;
    /**
     * 服务的版本号
     */
    private String versionNum;
    /**
     * 操作的用户
     */
    private String handleUser;
    /**
     * jacoco输出的地址
     */
    private String jacocoSavePath;

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public String getHandleUser() {
        return handleUser;
    }

    public void setHandleUser(String handleUser) {
        this.handleUser = handleUser;
    }

    public String getJacocoSavePath() {
        return jacocoSavePath;
    }

    public void setJacocoSavePath(String jacocoSavePath) {
        this.jacocoSavePath = jacocoSavePath;
    }

    public ProjectBaseInfo(String projectName, String versionNum, String handleUser, String jacocoSavePath) {
        this.projectName = projectName;
        this.versionNum = versionNum;
        this.handleUser = handleUser;
        this.jacocoSavePath = jacocoSavePath;
    }

    public ProjectBaseInfo() {

    }
}
