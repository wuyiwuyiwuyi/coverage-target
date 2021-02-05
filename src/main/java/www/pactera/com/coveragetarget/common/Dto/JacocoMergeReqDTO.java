package www.pactera.com.coveragetarget.common.Dto;

import www.pactera.com.coveragetarget.common.BaseEntity.BaseDTO;

public class JacocoMergeReqDTO extends BaseDTO {
    /**
     * 用户id
     */
    private String uid;
    /**
     * 分支合并id
     */
    private String mergeId;

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getMergeId() {
        return mergeId;
    }

    public void setMergeId(String mergeId) {
        this.mergeId = mergeId;
    }

    public JacocoMergeReqDTO(String uid, String mergeId) {
        this.uid = uid;
        this.mergeId = mergeId;
    }

    public JacocoMergeReqDTO(){

    }
}
