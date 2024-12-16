package com.es.jwtSecurityKotlin.model

import jakarta.persistence.Column


data class Administracion(

    @Column(nullable = false)
    var capital: Float? = null,
)
