package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("CatalogController")
public class CatalogController {
    @RequestMapping("hello")
    public String hello(Model model) {
        String name = "Thanh";
        model.addAttribute("name", name);
        return "hello";
    }
}
