package www.pactera.com.coveragetarget.common.Dto;

import www.pactera.com.coveragetarget.common.BaseEntity.BaseDTO;

public class JacocoMergeRespDTO extends BaseDTO {
    /**
     * 用户名
     */
    private String username;
    /**
     * 合并利率
     */
    private String mergeRate;
    /**
     * 合并时间
     */
    private String date;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMergeRate() {
        return mergeRate;
    }

    public void setMergeRate(String mergeRate) {
        this.mergeRate = mergeRate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public JacocoMergeRespDTO(String username, String mergeRate, String date) {
        this.username = username;
        this.mergeRate = mergeRate;
        this.date = date;
    }

    public JacocoMergeRespDTO(){

    }
}
