package com.cer.mall.mylitemall.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName: YmlConfig
 * @Description: TODO yml配置文件获取,在main方法加@EnableConfigurationProperties使此处的@ConfigurationProperties(prefix = "prefix")生效
 * @Author: xujin
 * @Date: 2019/11/27 16:17
 * @Version: 1.0
 */

//把普通pojo实例化到spring容器中，相当于配置文件中的
//<bean id="" class=""/>）
//泛指各种组件，就是说当我们的类不属于各种归类的时候（不属于@Controller、@Services等的时候），我们就可以使用@Component来标注这个类
@Component
//@PropertySource(value = {"classpath:applicationn.yml"})//此注解不适用yml文件,测试后发现可以用
@ConfigurationProperties(prefix = "prefix")
public class PrefixConfig {
//    //@Value("${prefix.name}")
//    private String name;
//
//    //@Value("${prefix.list}")
//    private List<Map<String,String>> list = new ArrayList<>();
//
//    @Value("${your.username}")
//    private String username;
//
//    @Value("${list2.name}")
//    private String list2name;
//
//    //@Value("${list2}")
//    //${list2}直接取值取不到,用list2.url的方式才可以取到
//    private Map<String,String> prefix = new HashMap<>();
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public List<Map<String, String>> getList() {
//        return list;
//    }
//
//    public void setList(List<Map<String, String>> list) {
//        this.list = list;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getList2name() {
//        return list2name;
//    }
//
//    public void setList2name(String list2name) {
//        this.list2name = list2name;
//    }
//
//    public Map<String, String> getPrefix() {
//        return prefix;
//    }
//
//    public void setPrefix(Map<String, String> prefix) {
//        this.prefix = prefix;
//    }
}
