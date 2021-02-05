package www.pactera.com.coveragetarget.share;


import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import www.pactera.com.coveragetarget.common.BaseEntity.ResponseData;
import www.pactera.com.coveragetarget.common.Dto.JacocoDumpReqDTO;
import www.pactera.com.coveragetarget.common.Dto.JacocoDumpRespDTO;
import www.pactera.com.coveragetarget.common.Dto.JacocoMergeReqDTO;
import www.pactera.com.coveragetarget.common.Dto.JacocoMergeRespDTO;

import javax.validation.Valid;


@RequestMapping("/pactera")
public interface JacocoDumpCollectShare {


    @RequestMapping("/jacoco/test")
    @ResponseBody
    ResponseData<JacocoDumpRespDTO> gainJacocoRate(@RequestBody @Valid JacocoDumpReqDTO reqDTO);


    @RequestMapping("/merge/test")
    @ResponseBody
    ResponseData<JacocoMergeRespDTO> gainMergeRate(@RequestBody @Valid JacocoMergeReqDTO reqDTO);

}
