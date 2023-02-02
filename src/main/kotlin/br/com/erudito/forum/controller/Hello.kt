package br.com.erudito.forum.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class Hello {

    @GetMapping
    fun hello() : String {
        return "Hello World alterado !"
    }
}