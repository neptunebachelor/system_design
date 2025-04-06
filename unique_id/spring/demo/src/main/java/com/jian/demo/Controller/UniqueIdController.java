//write a controller to generate unique id
package com.jian.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.jian.demo.service.UniqueIdService;


@RestController
@RequestMapping("/api")
public class UniqueIdController {
    @Autowired
    private UniqueIdService uniqueIdService;

    @GetMapping("/unique-id")
    public String getUniqueId() {
        String uniqueId = uniqueIdService.generateUniqueId();
        return uniqueId;
    }
}
