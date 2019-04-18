package com.example.demo.controller;

import com.example.demo.model.Result;
import com.example.demo.model.ResultA;
import com.example.demo.model.ResultB;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("interface-a")
    public Result resultA() {
        return new ResultA(200);
    }

    @GetMapping("interface-b")
    public Result resultB() {
        return new ResultB("ok");
    }

    @GetMapping("class")
    public ResultA classType() {
        return new ResultA(200);
    }
}
