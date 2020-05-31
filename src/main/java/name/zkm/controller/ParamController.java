package name.zkm.controller;

import name.zkm.model.Account;
import name.zkm.model.AccountCollection;
import name.zkm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
     * 引用类型封装1：前台传参转化为Java类。注意，前台传的数据类型与后台要一致，否则请求会报400
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

    /**
     * 引用类型封装3：前台传参转化为Java类,类中有集合
     * @param accountCollection
     * @return
     */
    @RequestMapping(value = "/saveAccountColl", method = RequestMethod.POST)
    public String saveAccountCollection(AccountCollection accountCollection){
        System.out.println(accountCollection);
        return "success";
    }

    /**
     * 引用类型封装4：前台传参转化为Java类,使用自定义类型转换器
     *              使用Servlet原生API
     * @param user
     * @return
     */
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public String saveUser(HttpServletRequest request, HttpServletResponse response, User user){
        System.out.println(user);
        HttpSession session = request.getSession();
        ServletContext context = session.getServletContext();
        return "success";
    }

}
