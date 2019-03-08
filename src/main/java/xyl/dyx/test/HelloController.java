package xyl.dyx.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;


/**
 * @description: a simple test controller
 * @author: DYX
 * @create: 2019--03--08 14:37
 **/

@RequestMapping("")
@Controller

public class HelloController {

    @RequestMapping(method = RequestMethod.GET)

    public String printHello(ModelMap model) {

        model.addAttribute("message","hello there!");

        return "hello";
    }
}
