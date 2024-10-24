package org.example

import jakarta.persistence.EntityManager
import jakarta.persistence.Persistence

object EntityManagerFactory {

    val emf = Persistence.createEntityManagerFactory("unidadMySQL")

    fun generateEntityManager(): EntityManager{
        return emf.createEntityManager()
    }

}