package main.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import main.domain.ExtendedProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Controller
public class ProductController {

    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping("/product/{id}")
    public String getProduct(@PathVariable("id") String id, Model model) throws Exception {
        InputStream is = new FileInputStream(new File("src/main/resources/static/products/id" + id + ".json"));
        model.addAttribute("model", objectMapper.readValue(is, ExtendedProduct.class));

        return "product-detail";
    }
}
