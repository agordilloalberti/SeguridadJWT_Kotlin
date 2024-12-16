package com.es.jwtSecurityKotlin.service

import com.es.jwtSecurityKotlin.model.Vehiculo
import com.es.jwtSecurityKotlin.repository.VehiculoRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class VehiculoService {

    @Autowired
    private lateinit var vehiculoRepository: VehiculoRepository


    fun addVehiculo(vehiculo: Vehiculo) : Vehiculo? {

        // Comprobamos que el usuario no existe en la base de datos


        // Creamos la instancia de Usuario


        /*
         La password del newUsuario debe estar hasheada, así que usamos el passwordEncoder que tenemos definido.
         ¿De dónde viene ese passwordEncoder?
         El objeto passwordEncoder lo tenemos que inyectar, y viene desde la clase SecurityConfig
         */


        // Guardamos el newUsuario en la base de datos... igual que siempre



        // Devolvemos el Usuario insertado en la BDD
        return null // Cambiar null por el usuario

    }



}