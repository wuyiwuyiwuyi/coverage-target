package www.pactera.com.coveragetarget.common.Dto;

import www.pactera.com.coveragetarget.common.BaseEntity.BaseDTO;

public class CommonDataDTO extends BaseDTO {

    /**
     * 公司名称
     */
    private String companyName;
    /**
     * 公司地址
     */
    private String companyAddress;

    /**
     * 所属国家
     */
    private String country;

    /**
     * 公司规模
     */
    private String companySize;

    /**
     * 公司创建时间
     */
    private String createTime;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCompanySize() {
        return companySize;
    }

    public void setCompanySize(String companySize) {
        this.companySize = companySize;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "CommonDataDTO{" +
                "companyName='" + companyName + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", country='" + country + '\'' +
                ", companySize='" + companySize + '\'' +
                ", createTime='" + createTime + '\'' +
                '}';
    }

    public CommonDataDTO(String companyName, String companyAddress, String country, String companySize, String createTime) {
        this.companyName = companyName;
        this.companyAddress = companyAddress;
        this.country = country;
        this.companySize = companySize;
        this.createTime = createTime;
    }

   public CommonDataDTO(){

   }
}
