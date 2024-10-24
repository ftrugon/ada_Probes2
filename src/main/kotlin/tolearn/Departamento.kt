package org.example.tolearn

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToOne
import jakarta.persistence.Table
import jakarta.persistence.Temporal
import jakarta.persistence.TemporalType
import java.util.Date

@Entity
@Table(name = "Departamentos")
class Departamento(


    @Column(name = "nombre", nullable = false, unique = true)
    val nombre: String,

    @OneToOne(mappedBy = "dpto")
    val empleado: Empleado?,

    @Column(name = "fecha_creacion")
    @Temporal(TemporalType.DATE)
    val fechaCreacion: Date,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val numDpto: Long? = null,
) {
}