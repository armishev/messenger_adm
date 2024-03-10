package com.arminik.nm.admin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    @GetMapping
    public List<String> get(){
        List<String> list = new ArrayList<>();
        list.add("privet ivan");
        list.add("fweofoie");
        list.add("privet ivan");
        list.add("privet ivan");
        list.add("privet ivan");
        list.add("privet ivan");
        list.add("privet ivan");
        list.add("privet ivan");
        list.add("privet ivan");
        return list;
    }
}
