package com.equinoxflower.controller;

import com.equinoxflower.entity.ModelAndView;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.Response;

/**
 * @program: EquinoxFlower
 * @description:
 * @author:
 * @create: 2019-01-29 11:50
 **/
@Controller
@RequestMapping("/boot")
public class BootController {
    @ResponseBody
    @RequestMapping(value = "test", method = RequestMethod.POST)
    public ModelAndView bootTest1() {
        ModelAndView mv = new ModelAndView();
        mv.setId(1994l);
        mv.setName("yangchun");
        return mv;
    }
}
