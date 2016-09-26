package main.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import main.domain.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

@Controller
public class HomeController {

    @Autowired
    private ObjectMapper objectMapper;

    @RequestMapping("/")
    public String greeting(Model model) throws Exception {
        InputStream is = new FileInputStream(new File("src/main/resources/static/products/all.json"));
        model.addAttribute("model", objectMapper.readValue(is, Product[].class));

        return "home";
    }

}
