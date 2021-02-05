package www.pactera.com.coveragetarget.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import netscape.javascript.JSObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataFormatting {


    public static void main(String[] args) {
        List<SourcePathInfo> list = new ArrayList<>();
        SourcePathInfo sourcePathInfo1 = new SourcePathInfo();
        sourcePathInfo1.setPackagePath("www/pactera/com/Jacocopactera/common/Dto/QueryCoverageRespDTO.java");
        sourcePathInfo1.setCoverLine("12");
        sourcePathInfo1.setTotalLineNumber("18");
        sourcePathInfo1.setSourceCoverageRate("80%");

        SourcePathInfo sourcePathInfo2 = new SourcePathInfo();
        sourcePathInfo2.setPackagePath("www/pactera/com/Jacocopactera/JacocoPacteraApplication.java");
        sourcePathInfo2.setCoverLine("4");
        sourcePathInfo2.setTotalLineNumber("8");
        sourcePathInfo2.setSourceCoverageRate("50%");
        list.add(sourcePathInfo1);
        list.add(sourcePathInfo2);
        List<Map<String, Data>> list2=new ArrayList<Map<String,Data>>();
        Map<String, Data> item=new HashMap<String, Data>();
        for (SourcePathInfo sourcePathInfo:list) {
            String allPath = sourcePathInfo.getPackagePath();
            String coverageLine = sourcePathInfo.getCoverLine();
            String totalLine = sourcePathInfo.getTotalLineNumber();
            String sourceCoverageRate = sourcePathInfo.getSourceCoverageRate();
            String[] paths = allPath.split("/");
            List<Data> dataList = new ArrayList<>();
            for (int i=0;i<paths.length;i++){
                String file = paths[i];
                item=new HashMap<String, Data>();
                Data data = new Data();
                data.setFileType(gainFileType(file));
                data.setFile(file);
                data.setFilePath(gainFilePath(paths,i));
                data.setCoverageNum(coverageLine);
                data.setCoverageRate(sourceCoverageRate);
                dataList.add(i,data);
                if(i==0){
                    item.put("label",dataList.get(i));
                    item.put("parentId",null);
                }else {
                    item.put("label", dataList.get(i));
                    item.put("parentId", dataList.get(i-1));
                }
                boolean isAdd=true;
                for(Map<String, Data> itemT:list2){
                    String label1 = itemT.get("label").getFile();
                    String label2 = item.get("label").getFile();
                    String parentId1 = null == itemT.get("parentId")?"":itemT.get("parentId").getFile();
                    String parentId2 = null == item.get("parentId")?"":item.get("parentId").getFile();
                    if(label1.equals(label2)&&  parentId2.equals(parentId1)){
                        isAdd=false;
                    }
                }
                if(isAdd){
                    list2.add(item);

                }
            }
        }
        JsonArray jsonArray=new JsonArray();
        for(Map<String, Data> itemT:list2){
            String parentId = null == itemT.get("parentId")?"":itemT.get("parentId").getFile();
            if("".equals(parentId)){
                JsonObject jsonObject=new JsonObject();
                Data jsonData = itemT.get("label");
                jsonObject.addProperty("label", JSON.toJSONString(jsonData));
                Map<String,String> map = new HashMap<>();
                //jsonArray.add(map);
                jsonArray.add(jsonObject);
               // seracherItem(jsonObject,list2);
            }
        }
        System.out.println(jsonArray.toString());
    }

    public void seracherItem(JsonObject jsonObject,List<Map<String, Data>> list){
        /*JsonArray jsonArray=new JsonArray();
        jsonObject.add("children",jsonArray);
        for(Map<String, String> itemT:list){
            if(jsonObject.get("label").getAsString().equals(itemT.get("parentId"))){
                //System.out.println(jsonObject.get("label").getAsString()+"  "+itemT.get("parentId"));
                JsonObject jsonObjectT=new JsonObject();
                jsonObjectT.addProperty("label", itemT.get("label"));
                jsonArray.add(jsonObjectT);
                seracherItem(jsonObjectT,list);
            }

        }*/
    }


    private static String gainFilePath(String[] str,int str2){
        String strPath = "";
        for(int i=0;i<=str2;i++){
            if(i<str2){
                strPath += str[i]+"/";
            }else {
                strPath += str[i];
            }
        }
        return strPath;
    }

    private static String gainFileType(String file){
        if(file.contains(".") && file.endsWith("java")){
            return "文件";
        }else {
            return "目录";
        }
    }


}
