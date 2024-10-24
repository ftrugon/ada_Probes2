package org.example.tolearn2

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "Usuarios")
class Usuario(

    @Id
    val nombreUser: String,

    @Column(name = "password", nullable = false, length = 20)
    val passwd: String

) {
}