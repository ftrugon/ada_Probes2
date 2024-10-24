package org.example

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table

@Entity
@Table(name = "Departamentos")
class Departamento(

    @Column
    var nombre: String,

    @ManyToOne
    @JoinColumn(name = "id_Instituto")
    val instituto: Instituto? = null,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

) {
    constructor():this("")
}