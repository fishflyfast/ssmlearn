package name.zkm.controller;

import name.zkm.model.User;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

// 控制器类
@Controller
@RequestMapping("/file")
public class FileUploadController {
    /**
     * 1.传统方式 上传文件
     * @return
     */
    @RequestMapping(value = "/fileUpload1", method = RequestMethod.POST)
    public String fileUpload1(HttpServletRequest request) throws Exception {
        System.out.println("文件 上传中。。。");

        //使用fileupload组件完成 文件 上传
        String realPath = request.getSession().getServletContext().getRealPath("/uploads/");
        File file = new File(realPath);
        if(!file.exists()){
            file.mkdirs();
        }
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        List<FileItem> fileItems = upload.parseRequest(request);
        for(FileItem item : fileItems){
            if(item.isFormField()){
                //普通文件项
            } else {
                //上传文件项
                String fileName = item.getName();
                String uuid = UUID.randomUUID().toString().replace("-","");
                fileName = uuid + fileName;
                item.write(new File(realPath, fileName));
                item.delete();//删除临时文件
            }
        }
        return "success";
    }

    /**
     * 2.SpringMvc方式上传文件
     * @return
     */
    @RequestMapping(value = "/fileUpload2")
    public String testVoid(HttpServletRequest request, MultipartFile upload) throws IOException {
        System.out.println("文件 上传中。。。");

        //使用fileupload组件完成 文件 上传
        String realPath = request.getSession().getServletContext().getRealPath("/uploads/");
        File file = new File(realPath);
        if(!file.exists()){
            file.mkdirs();
        }
        //上传文件项
        String fileName = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replace("-","");
        fileName = uuid + "_" + fileName;
        upload.transferTo(new File(realPath, fileName));
        return "success";
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
