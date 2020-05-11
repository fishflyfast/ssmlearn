package name.zkm.controller;

import name.zkm.controller.name.zkm.model.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 请求参数绑定
 */
@Controller
@RequestMapping("/params")
public class ParamController {

    /**
     * 参数不加注解时，前台传入的参数与方法中的参数名相同
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/testParam")
    public String paramsBinding(String username,String password){
        System.out.println("请求参数绑定测试");
        System.out.println("usernmae:" + username);
        System.out.println("password:" + password);
        return "success";
    }

    /**
     * 引用类型封装1：前台传参转化为Java类
     * @param account
     * @return
     */
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveAccount(Account account){
        System.out.println(account);
        return "success";
    }

    /**
     * 引用类型封装2：前台传参转化为Java类,类内部又有类
     * @param account
     * @return
     */
    @RequestMapping(value = "/saveAccountUser", method = RequestMethod.POST)
    public String saveAccountUser(Account account){
        System.out.println(account);
        return "success";
    }

}
