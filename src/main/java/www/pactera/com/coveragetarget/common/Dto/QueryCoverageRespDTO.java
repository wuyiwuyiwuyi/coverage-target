package www.pactera.com.coveragetarget.common.Dto;

import www.pactera.com.coveragetarget.common.BaseEntity.BaseDTO;

import java.util.List;

public class QueryCoverageRespDTO extends BaseDTO {

    private List<CoverageResultInfo> coverageResultInfos;

    public List<CoverageResultInfo> getCoverageResultInfos() {
        return coverageResultInfos;
    }

    public void setCoverageResultInfos(List<CoverageResultInfo> coverageResultInfos) {
        this.coverageResultInfos = coverageResultInfos;
    }
}
