/*
 *
 */
package com.demo.heroku;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/hello")
    public String s(@RequestParam(value="name",required=false) final String name){
        return "Hello" + name;

    }
}
