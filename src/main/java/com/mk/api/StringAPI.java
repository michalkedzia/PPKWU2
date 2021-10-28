package com.mk.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class StringAPI {
    @GetMapping("/{parameter}")
    public String stringInformation(@PathVariable("parameter") String parameter) {
        return parameter;
    }
}
