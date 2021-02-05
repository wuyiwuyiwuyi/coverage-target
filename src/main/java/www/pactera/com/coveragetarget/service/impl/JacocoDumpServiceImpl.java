package www.pactera.com.coveragetarget.service.impl;

import org.springframework.stereotype.Service;
import www.pactera.com.coveragetarget.common.BaseEntity.ResponseData;
import www.pactera.com.coveragetarget.common.Dto.*;
import www.pactera.com.coveragetarget.common.systemEmun.SystemErrorEnum;
import www.pactera.com.coveragetarget.common.systemEmun.SystemUserEnum;
import www.pactera.com.coveragetarget.service.JacocoDumpService;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.stream.Collectors;

@Service
public class JacocoDumpServiceImpl implements JacocoDumpService {


    @Override
    public ResponseData<JacocoDumpRespDTO> gainJacocoRate(JacocoDumpReqDTO reqDTO) {

        String num = reqDTO.getNum();

        List<CommonDataDTO> resultData = encapsulationData(num);

        if (resultData.isEmpty()) {
            ResponseData<JacocoDumpRespDTO> resp = new ResponseData<>();
            resp.setCode("00001");
            resp.setMessage("请求数据不存在");
            resp.setServerTime(new SimpleDateFormat("yyyy-MM-dd mm:HH:ss").format(new Date()));
            resp.setValue(new JacocoDumpRespDTO());
            return resp;
        }
        System.out.println("Jacoco收集覆盖率开始");
        CommonDataDTO result = resultData.get(resultData.size()-1);

        JacocoDumpRespDTO jacocoDumpRespDTO = new JacocoDumpRespDTO();
        jacocoDumpRespDTO.setDumpRate("80%");
        jacocoDumpRespDTO.setResult("收集成功");
        ResponseData<JacocoDumpRespDTO> resp2 = new ResponseData<>();
        resp2.setCode("00000");
        resp2.setMessage("请求成功");
        resp2.setServerTime(new SimpleDateFormat("yyyy-MM-dd mm:HH:ss").format(new Date()));
        resp2.setValue(jacocoDumpRespDTO);
        return resp2;

    }

    @Override
    public ResponseData<JacocoMergeRespDTO> gainMergeRate(JacocoMergeReqDTO reqDTO) {

        Callable<JacocoMergeRespDTO> mergeCallable = new Callable<JacocoMergeRespDTO>() {
            @Override
            public JacocoMergeRespDTO call() throws Exception {
                return encapsulationMerge(reqDTO);
            }
        };

        FutureTask<JacocoMergeRespDTO> futureTask = new FutureTask<>(mergeCallable);
        new Thread(futureTask).start();
        JacocoMergeRespDTO jacocoMergeRespDTO = null;
        try {
             jacocoMergeRespDTO =futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        //JacocoMergeRespDTO jacocoMergeRespDTO = encapsulationMerge(reqDTO);
        return new ResponseData<>(SystemErrorEnum.SUCCESS.getCode(),SystemErrorEnum.SUCCESS.getMsg(),jacocoMergeRespDTO);
    }

    private JacocoMergeRespDTO encapsulationMerge(JacocoMergeReqDTO reqDTO){
        String mergeId = reqDTO.getMergeId();
        JacocoMergeRespDTO jacocoMergeRespDTO = new JacocoMergeRespDTO();
        String username = SystemUserEnum.gainUsername(reqDTO.getUid());

        BigDecimal tatol = new BigDecimal("150");

        String mergeRate = "";

        if ("00001".equals(mergeId)) {
            BigDecimal num  =  new BigDecimal("80");
            BigDecimal mergeRate1 = num.divide(tatol,2,BigDecimal.ROUND_HALF_UP);
            mergeRate = formattingRate(Double.valueOf(String.valueOf(mergeRate1)));
        }else if("00002".equals(mergeId)){
            BigDecimal num  =  new BigDecimal("50");
            BigDecimal mergeRate1 = num.divide(tatol,2,BigDecimal.ROUND_HALF_UP);
            mergeRate = formattingRate(Double.valueOf(String.valueOf(mergeRate1)));
        }else if ("00003".equals(mergeId)){
            BigDecimal num  =  new BigDecimal("100");
            BigDecimal mergeRate1 = num.divide(tatol,2,BigDecimal.ROUND_HALF_UP);
            mergeRate = formattingRate(Double.valueOf(String.valueOf(mergeRate1)));
        }else {
            BigDecimal num  =  new BigDecimal("30");
            BigDecimal mergeRate1 = num.divide(tatol,2,BigDecimal.ROUND_HALF_UP);
            mergeRate = formattingRate(Double.valueOf(String.valueOf(mergeRate1)));
        }
        jacocoMergeRespDTO.setMergeRate(mergeRate);
        jacocoMergeRespDTO.setUsername(username);
        jacocoMergeRespDTO.setDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        return jacocoMergeRespDTO;
    }

    private String formattingRate(Double number){
        NumberFormat nf  = NumberFormat.getPercentInstance();
        String rate =  nf.format(number);
        return rate;
    }


    private List<CommonDataDTO> encapsulationData(String address){

        List<CommonDataDTO> commonDataDTOS = new ArrayList<>();

        CommonDataDTO commonDataDTO1 = new CommonDataDTO();
        commonDataDTO1.setCompanyName("腾讯");
        commonDataDTO1.setCompanyAddress("深圳");
        commonDataDTO1.setCreateTime("2000-10-01");
        commonDataDTO1.setCountry("中国");
        commonDataDTO1.setCompanySize("3567654");

        CommonDataDTO commonDataDTO2 = new CommonDataDTO();
        commonDataDTO2.setCompanyName("华为");
        commonDataDTO2.setCompanyAddress("深圳");
        commonDataDTO2.setCreateTime("1996-08-24");
        commonDataDTO2.setCountry("中国");
        commonDataDTO2.setCompanySize("5789965");

        CommonDataDTO commonDataDTO3 = new CommonDataDTO();
        commonDataDTO3.setCompanyName("万达");
        commonDataDTO3.setCompanyAddress("北京");
        commonDataDTO3.setCreateTime("1994-08-01");
        commonDataDTO3.setCountry("中国");
        commonDataDTO3.setCompanySize("235678765");

        CommonDataDTO commonDataDTO4 = new CommonDataDTO();
        commonDataDTO4.setCompanyName("阿里巴巴");
        commonDataDTO4.setCompanyAddress("杭州");
        commonDataDTO4.setCreateTime("2000-01-01");
        commonDataDTO4.setCountry("中国");
        commonDataDTO4.setCompanySize("23456776543");

        CommonDataDTO commonDataDTO5 = new CommonDataDTO();
        commonDataDTO5.setCompanyName("搜狐");
        commonDataDTO5.setCompanyAddress("北京");
        commonDataDTO5.setCreateTime("1989-01-01");
        commonDataDTO5.setCountry("中国");
        commonDataDTO5.setCompanySize("23456776543");

        commonDataDTOS.add(commonDataDTO1);
        commonDataDTOS.add(commonDataDTO2);
        commonDataDTOS.add(commonDataDTO3);
        commonDataDTOS.add(commonDataDTO4);
        commonDataDTOS.add(commonDataDTO5);

        Map<String,List<CommonDataDTO>> commons = commonDataDTOS.stream().collect(Collectors.groupingBy(CommonDataDTO::getCompanyAddress));

        for (String str: commons.keySet()) {
            if (address.equals(str)) {
                return commons.get(str);
            }
        }

        return null;

    }

}
