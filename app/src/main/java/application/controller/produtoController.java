package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import application.model.produtoRepository;

@Controller 
@RequestMapping("/produto")
public class produtoController {
    @Autowired 
    private produtoRepository produtoRepo;
    
    @RequestMapping("/produto")
    public String list (Model model) {
        model.addAttribute("produtos", produtoRepo.findAll());
        return "/produto/list";
    }

    public String insert() {
        return "/produto/insert";
    }
}
