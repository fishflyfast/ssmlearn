package name.zkm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 控制器类
@Controller
@RequestMapping(path = "/user")
public class HelloController {

    @RequestMapping(value = "/requestMapping", method = RequestMethod.GET)
    public String sayHello(){
        System.out.println("requestmapping with class and method");
        return "success";
    }

    /**
     * params配置测试，表示前台传参限制
     * params={"username"} : 前台必须传入参数username
     * params={"username=hehe"}:前台必须传入参数username,值必须是hehe
     * @return
     */
    @RequestMapping(path = "/params", params = {"username"})
    public String testparams(){
        System.out.println("requestmapping with params limit");
        return "success";
    }

}
