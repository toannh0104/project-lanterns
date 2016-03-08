package vn.vsii.rina.controller.backoffice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.vsii.rina.entity.Product;
import vn.vsii.rina.service.ProductService;

import java.util.List;

/**
 * Created by haltt on 3/8/2016.
 */
@Controller
@RequestMapping(value = "/bo/product")
public class ProductController extends BaseController{

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String admin(Model model) {
        String view = "bo.product";
        List<Product> lstProduct = productService.getProducts();
        model.addAttribute("lstProduct", lstProduct);
        return view;
    }
}
