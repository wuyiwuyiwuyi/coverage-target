package www.pactera.com.coveragetarget.common.Dto;


public class CollectCoverageReqDTO {
    /**
     * 服务名称
     */
    private String serverName;
    /**
     * 服务ip
     */
    private String serverIp;
    /**
     *  服务版本号
     */
    private String versionNum;

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public String getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(String versionNum) {
        this.versionNum = versionNum;
    }

    public CollectCoverageReqDTO( String serverName,String serverIp,String versionNum) {
        this.serverName = serverName;
        this.serverIp = serverIp;
        this.versionNum = versionNum;
    }

    public CollectCoverageReqDTO() {

    }
}
