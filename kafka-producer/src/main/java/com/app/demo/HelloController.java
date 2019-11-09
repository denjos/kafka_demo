package com.app.demo;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    private KafkaSender kafkaSender;

    HelloController(KafkaSender kafkaSender){
        this.kafkaSender=kafkaSender;
    }

    @GetMapping("rest/{name}")
    public String registrar(@PathVariable String name){
        kafkaSender.sendData(name);
        return "inserted";
    }
    @PostMapping("/rest/user")
    public String registrarUser(@RequestBody User user){
        kafkaSender.sendData(user);
        return "inserted";
    }
}
