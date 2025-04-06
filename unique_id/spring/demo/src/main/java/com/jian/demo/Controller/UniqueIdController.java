//write a controller to generate unique id
package com.jian.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class UniqueIdController {

    @GetMapping("/unique-id")
    public String getUniqueId(@RequestParam(value = "prefix", defaultValue = "") String prefix) {
        System.out.println("Generating unique ID with prefix: " + prefix);
        return "1";
    }
}
