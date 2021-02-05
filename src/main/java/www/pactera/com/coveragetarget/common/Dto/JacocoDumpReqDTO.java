package www.pactera.com.coveragetarget.common.Dto;

public class JacocoDumpReqDTO {

    private String time;

    private String num;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public JacocoDumpReqDTO(String time, String num) {
        this.time = time;
        this.num = num;
    }

    public JacocoDumpReqDTO() {

    }
}
