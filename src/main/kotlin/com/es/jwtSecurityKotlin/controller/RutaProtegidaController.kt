package com.es.jwtSecurityKotlin.controller

import org.springframework.web.bind.annotation.*

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

    @DeleteMapping("/recurso2")
    fun deleteRecursoProtegidoDos () : String {
        return "recurso 2"
    }
}