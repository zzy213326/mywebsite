package cn.zzy.mywebsite.Controller.TeamplatePageController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Error")
public class ErrorController {

    @RequestMapping
    public String ErrorPage(Model model,String errorMessage, String code)
    {
        if(errorMessage == null || "".equals(errorMessage)){
            errorMessage = "您所访问的资源不存在";
        }
        if(code == null || "".equals(code)){
            code = "404";
        }
        model.addAttribute("errorMessage",errorMessage);
        model.addAttribute("code",code);
        return "Error";
    }
}
