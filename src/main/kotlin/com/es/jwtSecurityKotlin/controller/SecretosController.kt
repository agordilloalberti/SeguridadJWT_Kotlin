package com.es.jwtSecurityKotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/secretos")
class SecretosController {

    @GetMapping("/secreto1")
    fun getRecursoProtegidoUno(): String {
        return "secreto 1"
    }
    @GetMapping("/secreto2")
    fun getSecreto2(): String {
        return "secreto 2"
    }
}