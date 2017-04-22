package com.iclass.iclassapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Daniel on 2017/4/9.
 * Function :
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/index")
    public @ResponseBody
    String index(){
        return "My API Index Page...";
    }
}
