package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DINGHONGXING on 2017/7/24.
 */
@RestController
public class Test {

    @RequestMapping(value = "test", method = RequestMethod.GET)
    public String test() {
        return "Success";
    }
}
