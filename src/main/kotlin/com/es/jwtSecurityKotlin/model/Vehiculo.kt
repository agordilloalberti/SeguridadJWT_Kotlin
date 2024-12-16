package com.es.jwtSecurityKotlin.model

import jakarta.persistence.*

@Entity
@Table(name = "vehiculos")
data class Vehiculo(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(nullable = false)
    var modelo: String? = null,

    @Column(nullable = false)
    var valor: Float? = null
)
