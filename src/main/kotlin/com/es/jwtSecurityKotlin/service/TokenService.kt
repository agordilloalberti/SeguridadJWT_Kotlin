package com.es.jwtSecurityKotlin.service

import com.nimbusds.jwt.JWTClaimsSet
import org.springframework.security.core.Authentication
import org.springframework.stereotype.Service
import java.time.Instant
import java.time.temporal.ChronoUnit
import java.util.*

@Service
class TokenService {


    fun generateToken(authentication: Authentication){

        val roles = authentication.authorities.joinToString(" ") { it.authority }

        val payload: JWTClaimsSet = JWTClaimsSet.Builder()
            .issuer("self")
            .issueTime(Date())
            .expirationTime(Date.from(Instant.now().plus(1,ChronoUnit.HOURS)))
            .subject(authentication.name)
            .claim("roles",roles)
            .build()
    }

}