package name.zkm.controller;

import name.zkm.exception.SysException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

// 控制器类
@Controller
@RequestMapping("/exception")
public class TestExceptionController {
    /**
     * 处理异常
     * @return
     */
    @RequestMapping(value = "/testException")
    public String fileUpload1(HttpServletRequest request) throws Exception {
        System.out.println("测试异常。。。");

        try{
            int a = 10 / 0;
        } catch (Exception e){
            e.printStackTrace();
            throw new SysException(e.getMessage());
        }

        return "success";
    }

}
