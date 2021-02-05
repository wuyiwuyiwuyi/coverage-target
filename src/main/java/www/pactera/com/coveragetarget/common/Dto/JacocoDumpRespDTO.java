package www.pactera.com.coveragetarget.common.Dto;


public class JacocoDumpRespDTO {

    private String result;

    private String dumpRate;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getDumpRate() {
        return dumpRate;
    }

    public void setDumpRate(String dumpRate) {
        this.dumpRate = dumpRate;
    }

    public JacocoDumpRespDTO() {

    }

    public JacocoDumpRespDTO(String result, String dumpRate) {
        this.result = result;
        this.dumpRate = dumpRate;
    }

    @Override
    public String toString() {
        return "JacocoDumpRespDTO{" +
                "result='" + result + '\'' +
                ", dumpRate='" + dumpRate + '\'' +
                '}';
    }
}
