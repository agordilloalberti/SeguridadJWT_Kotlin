package com.es.jwtSecurityKotlin.repository

import com.es.jwtSecurityKotlin.model.Administracion
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface AdministracionRepository : JpaRepository<Administracion, Long> {

    fun getData() : Optional<Administracion>

}