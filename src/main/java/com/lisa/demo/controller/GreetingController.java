package com.lisa.demo.controller;

import com.lisa.demo.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.concurrent.atomic.AtomicLong;

@RestController // inkluderar @ResponseBody i sig -> mindre syntax
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    // value = input value
    // defaultValue = optional value if user missed input
    // String name = reference variable to the input value
    /*@GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }*/

    @GetMapping("/greeting")
    public Mono<String> sayHello() { // 'Mono' used for singular data
        return Mono.just("Hello World!");
    }

    @GetMapping("/batch-greeting")
    public Flux<String> batchSayHello() { // 'Flux' used for streams of data
        return Flux.just("Hello World!", "Hello Again, World!");
    }




}
