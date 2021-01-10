package simplespringmvc.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import simplespringmvc.mvc.services.CurrencyValueExtracter;

@Controller
public class CurrencyController {
    private final CurrencyValueExtracter extracter;

    @Autowired
    public CurrencyController(CurrencyValueExtracter extracter) {
        this.extracter = extracter;
    }

    @GetMapping("/converter")
    public String convertTo(@RequestParam String code,
                            @RequestParam int amount,
                            Model model){
        model.addAttribute("out", String.format("%.2f", extracter.extractValueFor(code,amount)));
        model.addAttribute("code", code);
        model.addAttribute("amount", amount);
        return "value.html";
    }
}
