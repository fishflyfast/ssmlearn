package name.zkm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

// 控制器类
@Controller
@RequestMapping("/inter")
public class TestInterceptorController {
    /**
     * 拦截器测试
     * @return
     */
    @RequestMapping(value = "/testInterceptor")
    public String fileUpload1(HttpServletRequest request) throws Exception {
        System.out.println("测试拦截器。。。");

        return "success";
    }

}
