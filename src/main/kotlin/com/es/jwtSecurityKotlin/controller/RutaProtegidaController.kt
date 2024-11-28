package com.es.jwtSecurityKotlin.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rutas_protegidas")
class RutaProtegidaController {


    @GetMapping("/recurso1")
    fun getRecursoProtegidoUno () : String {
        return "Este recurso sólo puede ser accedido por usuarios registrados en la BD"
    }

    @PostMapping("/recurso2")
    fun getRecursoProtegidoDos () : String {
        return "recurso 2"
    }
}