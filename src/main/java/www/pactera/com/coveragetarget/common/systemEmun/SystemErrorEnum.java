package www.pactera.com.coveragetarget.common.systemEmun;

public enum SystemErrorEnum {

    SUCCESS("00000","请求成功"),
    ERROR("00001","请求错误"),
    EXCEPTION("00002","请求异常"),
    MERGE_HANDLE_USER_EXCEPTION("00003","请选择相同的用户进行合并"),
    MERGE_VERSION_NUMBER_EXCEPTION("00004","请选择同期的版本进行合并"),
    CMD_EXECUTE_EXCEPTION("00005","命令行执行异常");


    private String code;

    private String msg;

    SystemErrorEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
