package com.es.jwtSecurityKotlin.repository

import com.es.jwtSecurityKotlin.model.Vehiculo
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface VehiculoRepository : JpaRepository<Vehiculo, Long> {

    fun findById(id: Int) : Optional<Vehiculo>

}