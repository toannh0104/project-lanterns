package vn.vsii.rina.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.vsii.rina.entity.Product;
import vn.vsii.rina.service.CategoryService;
import vn.vsii.rina.service.ProductService;

import java.util.List;

/**
 * Created by toannh on 2/25/2016.
 * Product controller
 */
@Controller
@RequestMapping(value = "/san-pham")
public class ProductController extends BaseController{

    @Autowired
    private ProductService productService;
    @Autowired
    private CategoryService categoryService;
    @RequestMapping(value = "/danh-muc/{categoryID}/{categoryName}.html", method = RequestMethod.GET)
    public String byCategory(Model model, @PathVariable String categoryID, @PathVariable String categoryName) {
        String viewName = "product.list";
        List<Product> lstProduct = categoryService.getCategory(categoryID).getProducts(); //productService.getProducts();
        model.addAttribute("lstProduct", lstProduct);
        model.addAttribute("user", getPrincipal());
        return viewName;
    }
}
