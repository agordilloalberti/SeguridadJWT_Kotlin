package com.es.jwtSecurityKotlin.model

import jakarta.persistence.*

@Entity
@Table(name = "usuarios")
data class Usuario(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    @Column(unique = true, nullable = false)
    var username: String? = null,

    @Column(nullable = false)
    var password: String? = null,

    @Column(nullable = false)
    var nombre: String? = null,

    @Column(nullable = true)
    var apellidos: String? =null,

    @Column(nullable = false)
    var edad: Int? = null,

    var roles: String? = null // e.g., "ROLE_USER,ROLE_ADMIN"

)
