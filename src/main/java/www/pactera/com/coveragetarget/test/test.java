package www.pactera.com.coveragetarget.test;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class test {

    public static void main(String[] args) {
        List<Map<String, String>> list=new ArrayList<Map<String,String>>();
        Map<String, String> item=new HashMap<String, String>();
        List<String> sourcePathInfoDOList = new ArrayList<>();
        sourcePathInfoDOList.add("www/pactera/com/Jacocopactera/common/Dto/QueryCoverageRespDTO.java");
        sourcePathInfoDOList.add("www/pactera/com/Jacocopactera/JacocoPacteraApplication.java");
        for(String str:sourcePathInfoDOList){
            String strArr[]=str.split("/");
            for(int i=0;i<strArr.length;i++){
                item=new HashMap<String, String>();
                if(i==0){
                    item.put("label", strArr[i]);
                    item.put("parentId", "");
                }else{
                    item.put("label", strArr[i]);
                    item.put("parentId", strArr[i-1]);
                }
                // 判断是否已经存在值相同的
                boolean isAdd=true;
                for(Map<String, String> itemT:list){
                    if(itemT.get("label").equals(item.get("label"))&&itemT.get("parentId").equals(item.get("parentId"))){
                        isAdd=false;
                    }
                }
                if(isAdd){
                    list.add(item);
                }
            }
        }
        // 开始递归
        JsonArray jsonArray=new JsonArray();
        for(Map<String, String> itemT:list){
            if("".equals(itemT.get("parentId"))){
                JsonObject jsonObject=new JsonObject();
                jsonObject.addProperty("label", itemT.get("label"));
                jsonArray.add(jsonObject);
                seracherItem(jsonObject,list);
            }
        }
        System.out.println(jsonArray);
    }

    public static void seracherItem(JsonObject jsonObject,List<Map<String, String>> list){
        JsonArray jsonArray=new JsonArray();
        jsonObject.add("children",jsonArray);
        for(Map<String, String> itemT:list){
            if(jsonObject.get("label").getAsString().equals(itemT.get("parentId"))){
                //System.out.println(jsonObject.get("label").getAsString()+"  "+itemT.get("parentId"));
                JsonObject jsonObjectT=new JsonObject();
                jsonObjectT.addProperty("label", itemT.get("label"));
                jsonArray.add(jsonObjectT);
                seracherItem(jsonObjectT,list);
            }

        }
    }


}
