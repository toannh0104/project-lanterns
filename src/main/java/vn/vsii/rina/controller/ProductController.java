package vn.vsii.rina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.vsii.rina.entity.Product;
import vn.vsii.rina.service.ProductService;

import java.util.List;

/**
 * Created by toannh on 2/25/2016.
 * Product controller
 */
@Controller
@RequestMapping(value = "/product")
public class ProductController extends BaseController{

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String index(Model model) {
        String viewName = "product.list";
        List<Product> lstProduct = productService.getProducts();
        model.addAttribute("lstProduct", lstProduct);
        model.addAttribute("user", getPrincipal());
        return viewName;
    }
}
