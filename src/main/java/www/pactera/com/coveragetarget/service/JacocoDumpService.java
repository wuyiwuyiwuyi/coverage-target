package www.pactera.com.coveragetarget.service;


import www.pactera.com.coveragetarget.common.BaseEntity.ResponseData;
import www.pactera.com.coveragetarget.common.Dto.JacocoDumpReqDTO;
import www.pactera.com.coveragetarget.common.Dto.JacocoDumpRespDTO;
import www.pactera.com.coveragetarget.common.Dto.JacocoMergeReqDTO;
import www.pactera.com.coveragetarget.common.Dto.JacocoMergeRespDTO;



public interface JacocoDumpService {

    ResponseData<JacocoDumpRespDTO> gainJacocoRate(JacocoDumpReqDTO reqDTO);

    ResponseData<JacocoMergeRespDTO> gainMergeRate(JacocoMergeReqDTO reqDTO);

}
