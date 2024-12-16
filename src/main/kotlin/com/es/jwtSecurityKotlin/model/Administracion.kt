package com.es.jwtSecurityKotlin.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table

@Entity
@Table(name = "administración")
data class Administracion(

    @Column(nullable = false)
    var capital: Float? = null,

    @Column(nullable = false)
    var empleados: Int? = null,

    @Column(nullable = false)
    var vehiculos: Int? = null
)
