package vn.vsii.rina.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by toannh on 3/7/2016.
 */
@Controller
public class HTTPErrorHandler {

    @RequestMapping(value="/404")
    public String error404(){
        System.out.println("custom error handler");
        return "redirect:/product/list.html";
    }
}
