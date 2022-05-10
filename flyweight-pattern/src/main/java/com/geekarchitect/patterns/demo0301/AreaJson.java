package com.geekarchitect.patterns.demo0301;

import com.alibaba.fastjson.JSON;

import java.util.List;
import java.util.Random;

/**
 * @author 极客架构师@吴念
 * @createTime 2022/5/2
 */
public class AreaJson {
    public static List<Area> areaList;
    public static Random random=new Random();
    static {
        String cityJson="\n" +
                "\n" +
                "[\n" +
                "  {\n" +
                "    \"cityCode\": \"130100\",\n" +
                "    \"cityName\": \"石家庄市\",\n" +
                "    \"provinceId\": \"13\",\n" +
                "    \"provinceName\": \"河北省\",\n" +
                "    \"provinceCode\": \"130000\",\n" +
                "    \"cityId\": \"01\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"130200\",\n" +
                "    \"cityName\": \"唐山市\",\n" +
                "    \"provinceId\": \"13\",\n" +
                "    \"provinceName\": \"河北省\",\n" +
                "    \"provinceCode\": \"130000\",\n" +
                "    \"cityId\": \"02\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"130300\",\n" +
                "    \"cityName\": \"秦皇岛市\",\n" +
                "    \"provinceId\": \"13\",\n" +
                "    \"provinceName\": \"河北省\",\n" +
                "    \"provinceCode\": \"130000\",\n" +
                "    \"cityId\": \"03\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"130400\",\n" +
                "    \"cityName\": \"邯郸市\",\n" +
                "    \"provinceId\": \"13\",\n" +
                "    \"provinceName\": \"河北省\",\n" +
                "    \"provinceCode\": \"130000\",\n" +
                "    \"cityId\": \"04\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"130500\",\n" +
                "    \"cityName\": \"邢台市\",\n" +
                "    \"provinceId\": \"13\",\n" +
                "    \"provinceName\": \"河北省\",\n" +
                "    \"provinceCode\": \"130000\",\n" +
                "    \"cityId\": \"05\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"130600\",\n" +
                "    \"cityName\": \"保定市\",\n" +
                "    \"provinceId\": \"13\",\n" +
                "    \"provinceName\": \"河北省\",\n" +
                "    \"provinceCode\": \"130000\",\n" +
                "    \"cityId\": \"06\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"130700\",\n" +
                "    \"cityName\": \"张家口市\",\n" +
                "    \"provinceId\": \"13\",\n" +
                "    \"provinceName\": \"河北省\",\n" +
                "    \"provinceCode\": \"130000\",\n" +
                "    \"cityId\": \"07\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"130800\",\n" +
                "    \"cityName\": \"承德市\",\n" +
                "    \"provinceId\": \"13\",\n" +
                "    \"provinceName\": \"河北省\",\n" +
                "    \"provinceCode\": \"130000\",\n" +
                "    \"cityId\": \"08\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"130900\",\n" +
                "    \"cityName\": \"沧州市\",\n" +
                "    \"provinceId\": \"13\",\n" +
                "    \"provinceName\": \"河北省\",\n" +
                "    \"provinceCode\": \"130000\",\n" +
                "    \"cityId\": \"09\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"131000\",\n" +
                "    \"cityName\": \"廊坊市\",\n" +
                "    \"provinceId\": \"13\",\n" +
                "    \"provinceName\": \"河北省\",\n" +
                "    \"provinceCode\": \"130000\",\n" +
                "    \"cityId\": \"10\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"131100\",\n" +
                "    \"cityName\": \"衡水市\",\n" +
                "    \"provinceId\": \"13\",\n" +
                "    \"provinceName\": \"河北省\",\n" +
                "    \"provinceCode\": \"130000\",\n" +
                "    \"cityId\": \"11\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"140100\",\n" +
                "    \"cityName\": \"太原市\",\n" +
                "    \"provinceId\": \"14\",\n" +
                "    \"provinceName\": \"山西省\",\n" +
                "    \"provinceCode\": \"140000\",\n" +
                "    \"cityId\": \"01\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"140200\",\n" +
                "    \"cityName\": \"大同市\",\n" +
                "    \"provinceId\": \"14\",\n" +
                "    \"provinceName\": \"山西省\",\n" +
                "    \"provinceCode\": \"140000\",\n" +
                "    \"cityId\": \"02\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"140300\",\n" +
                "    \"cityName\": \"阳泉市\",\n" +
                "    \"provinceId\": \"14\",\n" +
                "    \"provinceName\": \"山西省\",\n" +
                "    \"provinceCode\": \"140000\",\n" +
                "    \"cityId\": \"03\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"140400\",\n" +
                "    \"cityName\": \"长治市\",\n" +
                "    \"provinceId\": \"14\",\n" +
                "    \"provinceName\": \"山西省\",\n" +
                "    \"provinceCode\": \"140000\",\n" +
                "    \"cityId\": \"04\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"140500\",\n" +
                "    \"cityName\": \"晋城市\",\n" +
                "    \"provinceId\": \"14\",\n" +
                "    \"provinceName\": \"山西省\",\n" +
                "    \"provinceCode\": \"140000\",\n" +
                "    \"cityId\": \"05\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"140600\",\n" +
                "    \"cityName\": \"朔州市\",\n" +
                "    \"provinceId\": \"14\",\n" +
                "    \"provinceName\": \"山西省\",\n" +
                "    \"provinceCode\": \"140000\",\n" +
                "    \"cityId\": \"06\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"140700\",\n" +
                "    \"cityName\": \"晋中市\",\n" +
                "    \"provinceId\": \"14\",\n" +
                "    \"provinceName\": \"山西省\",\n" +
                "    \"provinceCode\": \"140000\",\n" +
                "    \"cityId\": \"07\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"140800\",\n" +
                "    \"cityName\": \"运城市\",\n" +
                "    \"provinceId\": \"14\",\n" +
                "    \"provinceName\": \"山西省\",\n" +
                "    \"provinceCode\": \"140000\",\n" +
                "    \"cityId\": \"08\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"140900\",\n" +
                "    \"cityName\": \"忻州市\",\n" +
                "    \"provinceId\": \"14\",\n" +
                "    \"provinceName\": \"山西省\",\n" +
                "    \"provinceCode\": \"140000\",\n" +
                "    \"cityId\": \"09\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"141000\",\n" +
                "    \"cityName\": \"临汾市\",\n" +
                "    \"provinceId\": \"14\",\n" +
                "    \"provinceName\": \"山西省\",\n" +
                "    \"provinceCode\": \"140000\",\n" +
                "    \"cityId\": \"10\"\n" +
                "  },\n" +
                "  {\n" +
                "    \"cityCode\": \"141100\",\n" +
                "    \"cityName\": \"吕梁市\",\n" +
                "    \"provinceId\": \"14\",\n" +
                "    \"provinceName\": \"山西省\",\n" +
                "    \"provinceCode\": \"140000\",\n" +
                "    \"cityId\": \"11\"\n" +
                "  }\n" +
                "  ]";
        areaList = JSON.parseArray(cityJson, Area.class);
    }

    /**
     * 随机获取一个地区信息
     * @return
     */
    public static Area randomArea(){
        return areaList.get(random.nextInt(areaList.size()));
    }

    /**
     * 根据cityCode获取Area
     * @param cityCode
     * @return
     */
    public static Area getAreaByCityCode(Long cityCode){
        for(Area area:areaList){
            if(cityCode.longValue()==area.getCityCode())return area;
        }
        return null;
    }
}
