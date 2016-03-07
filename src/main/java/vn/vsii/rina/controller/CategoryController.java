package vn.vsii.rina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.vsii.rina.entity.Category;
import vn.vsii.rina.service.CategoryService;

import java.util.List;

/**
 * Created by toannh on 3/8/2016.
 */
@Controller
@RequestMapping(value = "/danh-muc")
public class CategoryController extends BaseController{

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/chi-tiet.html", method = RequestMethod.GET)
    public String list(Model model) {
        String viewName = "category.list";
        List<Category> categories = categoryService.getCategories();
        model.addAttribute("categories", categories);
        model.addAttribute("user", getPrincipal());
        return viewName;
    }
}