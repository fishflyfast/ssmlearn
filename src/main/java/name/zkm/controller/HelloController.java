package name.zkm.controller;

import name.zkm.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

// 控制器类
@Controller
public class HelloController {
    /**
     * 1.返回值为String
     * @return
     */
    @RequestMapping(value = "/testString", method = RequestMethod.GET)
    public String testString(Model model){
        System.out.println("testing string...");
        User user = new User();
        user.setAge(23);
        user.setBirthday(new Date());
        user.setUname("zhaokm");
        model.addAttribute("user", user);
        return "success";
    }

    /**
     * 2.响应值为void,通过请求转发等转到新页面
     * @return
     */
    @RequestMapping(value = "/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("testvoid is running");
        //1.请求转发
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //2.重定向
        //response.sendRedirect(request.getContextPath() + "/index.jsp");
        //3.直接输出内容
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print("雷好哦");
        return;
    }

    /**
     * 3.响应体为ModelAndView
     * @return
     */
    @RequestMapping(value = "testModelAndView")
    public ModelAndView testModelAndView(){
        System.out.println("testing testModelAndView...");
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setAge(21);
        user.setBirthday(new Date());
        user.setUname("lsjfl");
        mv.addObject("user", user);
        mv.setViewName("success");
        return mv;
    }

    /**
     * 4.使用关键字进行请求转发或重定向
     * @return
     */
    @RequestMapping("/testForwordRedirect")
    public String testForwordRedirect(){
        System.out.println("testForwordRedirect is running....");
        //1.请求转发
        //return "forward:/WEB-INF/pages/success.jsp";
        //2.重定向
        return "redirect:/index.jsp";
    }

    /**
     * 模拟异步请求响应。1.将请求数据作为字符串进行接收
     * @param body
     */
    @RequestMapping("/testAjax")
    public void testAjax(@RequestBody String body){
        System.out.println("testAjax...");
        System.out.println(body);
    }

    /**
     * 模拟异步请求响应。2.将请求数据封装为Java类。并且返回Java对象，通过ResponseBody注解转化为字符串给前台
     * @param user
     */
    @RequestMapping("/testAjax1")
    public @ResponseBody User testAjax1(@RequestBody User user){
        System.out.println("testAjax...");
        System.out.println(user);
        user.setBirthday(new Date());
        return user;
    }
}
