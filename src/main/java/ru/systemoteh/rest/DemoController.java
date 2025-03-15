package ru.systemoteh.rest;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping(value = "/word")
    public String word(@RequestParam String param) {
        return "Hello, word!";
    }

    @GetMapping("/error")
    public String error() {
        return "Hello, error!";
    }

    @PostMapping("/echo")
    public String echo(@RequestBody String message) {
        return "Echo: " + message;
    }
}