package name.zkm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@RequestMapping(value = "/anno")
@SessionAttributes({"msg"}) //第2步，将该值放到Session域中
public class AnnoController {

    /**
     * 1.RequestParam注解中的name属性用于标识前台传过来参数名，将其与方法的参数对应起来。required默认为true
     * @param username
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "uname") String username){
        System.out.println("executed...");
        System.out.println(username);
        return "success";
    }

    /**
     * 2.RequestBody:前台通过Post请求提交，接收到的数据类似：uname=sdf&age=23
     * @param body
     * @return
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println(body);
        return "success";
    }

    /**
     * 3.PathVaribale:用来绑定URL中的占位符
     */
    @RequestMapping("/testPathVarible/{uname}")
    public String testPathVarible(@PathVariable(name="uname") String name){
        System.out.println(name);
        return "success";
    }

    /**
     * 4.RequestHeader:获取请求头的值
     */
    @RequestMapping("/testRequestHeader")
    public String testRequestHeader(@RequestHeader(value = "Accept") String accept){
        System.out.println(accept);
        return "success";
    }

    /**
     * 5.cookieValue:获取cookieValue的值
     */
    @RequestMapping("/testCookieValue")
    public String testCookieValue(@CookieValue(value = "JSESSIONID") String jsessionId){
        System.out.println(jsessionId);
        return "success";
    }

    /**
     * 6.ModelAttribute用在方法上，表示该方法会在Controller的方法执行之前执行
     * 该注解的其他使用省略
     */
    @ModelAttribute
    public void showUser(){
        System.out.println("showuser....");
    }

    /**
     * 7.SessionAttributes
     * 第一步，将键值对放到model中
     * @param model
     * @return
     */
    @RequestMapping("/setAttribute")
    public String setSession(Model model){
        model.addAttribute("msg", "beautiful");
        return "success";
    }

    /**
     * 7.SessionAttributes
     * 第3步，取Session的值
     * @param modelMap
     * @return
     */
    @RequestMapping("/getAttribute")
    public String getSession(ModelMap modelMap){
        String msg = (String)modelMap.get("msg");
        System.out.println(msg);
        return "success";
    }
    /**
     * 7.SessionAttributes
     * 第4步，清除Session
     * @param status
     * @return
     */
    @RequestMapping("/delAttribute")
    public String delAttribute(SessionStatus status){
        System.out.println("deleting session....");
        status.setComplete();
        return "success";
    }
}
