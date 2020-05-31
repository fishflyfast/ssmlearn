package name.zkm.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 自定义类型转换
 */
public class StringToDateConverter implements Converter<String, Date> {
    /**
     *
     * @param source
     * @return
     */
    @Override
    public Date convert(String source) {
        if(source == null){
            throw new RuntimeException("传入参数为空");
        }
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        try {
           return df.parse(source);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error when convert date");
            throw new RuntimeException("数据类型转换出错");
        }
    }
}
