bilibili地址：https://www.bilibili.com/video/BV1J7411Z7QA

SSM框架整合
1.spring整合SpingMVC和Mybatis
2.保证每个框架本身能正常运行,然后去整合
3.搭建环境，配置类，写Spring配置文件
4.搭建及整合SpringMVC环境
    4.1 配置前端控制器
    4.2 配置Springmvc配置文件：开启注解扫描，配置视图解析器，过滤静态资源，开启SpringMVC注解的支持
    4.3 整合:在web.xml中配置Spring监听器,目的是让Tomcat启动时加载Spring配置文件（P50集 讲三大组件：Spring监听器，前端控制器，过滤器）
5.配置Mybatis
6.整合Mybatis：将Mybatis的配置放到Spring中，原Mybatis的配置文件删除
    6.1 配置连接池
    6.2 配置SqlSessionFactory工厂
    6.3 配置dao所在的包
7.配置事务

