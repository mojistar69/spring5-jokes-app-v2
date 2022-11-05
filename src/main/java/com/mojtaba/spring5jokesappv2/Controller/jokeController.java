package com.mojtaba.spring5jokesappv2.Controller;

import com.mojtaba.spring5jokesappv2.services.jokeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class jokeController {

    private final jokeService jokeService;

    public jokeController(jokeService jokeService) {
        this.jokeService=jokeService;
    }

    @RequestMapping({"/",""})
    public String showjoke(Model model){
        String jokestr=jokeService.getjoke();
        model.addAttribute("joke",jokestr );
        System.out.println(jokestr);
            return "index";
    }
}
