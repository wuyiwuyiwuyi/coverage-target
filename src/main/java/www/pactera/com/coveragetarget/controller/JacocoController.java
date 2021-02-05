package www.pactera.com.coveragetarget.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import www.pactera.com.coveragetarget.common.BaseEntity.ResponseData;
import www.pactera.com.coveragetarget.common.Dto.JacocoDumpReqDTO;
import www.pactera.com.coveragetarget.common.Dto.JacocoDumpRespDTO;
import www.pactera.com.coveragetarget.common.Dto.JacocoMergeReqDTO;
import www.pactera.com.coveragetarget.common.Dto.JacocoMergeRespDTO;
import www.pactera.com.coveragetarget.service.JacocoDumpService;
import www.pactera.com.coveragetarget.share.JacocoDumpCollectShare;

import javax.validation.Valid;


@Controller
public class JacocoController implements JacocoDumpCollectShare {

    @Autowired
    private JacocoDumpService jacocoDumpService;

    @Override
    public ResponseData<JacocoDumpRespDTO> gainJacocoRate(@RequestBody @Valid JacocoDumpReqDTO reqDTO) {
        return jacocoDumpService.gainJacocoRate(reqDTO);
    }

    @Override
    public ResponseData<JacocoMergeRespDTO> gainMergeRate(@RequestBody @Valid JacocoMergeReqDTO reqDTO) {
        return jacocoDumpService.gainMergeRate(reqDTO);
    }
}
