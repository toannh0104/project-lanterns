package vn.vsii.rina.controller.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.vsii.rina.controller.backoffice.BaseController;
import vn.vsii.rina.entity.Product;
import vn.vsii.rina.service.ProductService;

import java.util.List;

/**
 * Created by toannh on 2/25/2016.
 * Product controller
 */
@Controller
@RequestMapping(value = "/")
public class SiteController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String index(Model model) {
        String viewName = "product.maihoang";
        List<Product> lstProduct = productService.getProducts();
        model.addAttribute("catalog", "Hot");
        model.addAttribute("lstProduct", lstProduct);
        return viewName;
    }

    @RequestMapping(value = "/catalog/{catalogId}", method = RequestMethod.GET)
    public String catalog(@PathVariable String catalogId, Model model) {
        String viewName = "product.catalog";
        List<Product> lstProduct = productService.getProducts();
        model.addAttribute("catalog", catalogId);
        model.addAttribute("lstProduct", lstProduct);
        return viewName;
    }

    @RequestMapping(value = "/product/{productId}", method = RequestMethod.GET)
    public String product(@PathVariable String productId, Model model) {
        String viewName = "product.details";
        Product product = productService.getProduct(productId);
        model.addAttribute("product", product);
        return viewName;
    }
}
