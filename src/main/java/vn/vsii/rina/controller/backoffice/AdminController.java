package vn.vsii.rina.controller.backoffice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.vsii.rina.entity.Product;

import java.util.List;


@Controller
@RequestMapping(value = "/bo/admin")
public class AdminController extends BaseController{

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String admin(Model model) {
        String view = "bo.admin";
        return view;
    }
}
