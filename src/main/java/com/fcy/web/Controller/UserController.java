package com.fcy.web.Controller;

import com.fcy.web.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.logging.Logger;
@Controller
@RequestMapping("/user")
public class UserController {
    private static Logger logger = Logger.getLogger(UserController.class.getName());

    @RequestMapping("/login")
    @ResponseBody
    public User login(@RequestParam("username") String username,
                      @RequestParam("password") String password){
        return new User(0,username,password);
    }
    @RequestMapping("/index")
    public String index(){
        return "index";
    }
}
