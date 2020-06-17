package name.zkm.controller;

import name.zkm.model.ZkmlifeRecords;
import name.zkm.service.ZkmlifeRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

// 控制器类
@Controller
@RequestMapping("/record")
public class MyRecordController {

    @Autowired
    private ZkmlifeRecordService zkmlifeRecordService;
    /**
     *
     * @return
     */
    @RequestMapping(value = "/findAll")
    public String findAll(HttpServletRequest request) throws Exception {
        System.out.println("表现层:查询所有数据。。。");
        List<ZkmlifeRecords> all = zkmlifeRecordService.findAll();
        System.out.println(all.size());
        return "list";
    }

}
