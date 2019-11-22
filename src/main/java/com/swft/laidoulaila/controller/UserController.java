package com.swft.laidoulaila.controller;

import com.swft.laidoulaila.models.vo.UserVO;
import com.swft.laidoulaila.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
import java.util.UUID;
import com.alibaba.fastjson.JSONObject;
//$.ajax{
//        type = "post",
//        dataType = "json",
//        data:JSON.stringify({
//            "id" = "",
//            "name" = "kabu",
//            "zhiye" = "student",
//            "sex" = "male",
//        }),
//        }
@RequestMapping("test1")
public class UserController {


    public void test1(@RequestBody UserVO user){
        String id = UUID.randomUUID().toString().replaceAll("-","");
        user.setUserId(id);
        user.setUserGender(JSON.toJSONString(user.getUserGender()));
        user.setUserJob(JSON.toJSONString(user.getUserJob()));
        user.setUserName(JSON.toJSONString(user.getUserName()));
        System.out.println(id);
    }


}
