package org.example.tolearn

import jakarta.persistence.CascadeType
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.Table

@Entity
@Table(name="Empleados")
class Empleado(

    @Column(name = "nombre")
    val nombre: String,

    @Column
    val edad : Int,

    @OneToOne(cascade = [CascadeType.ALL])
    @JoinColumn(name = "id_dpto")
    val dpto: Departamento,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
) {
}