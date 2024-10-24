package org.example

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.JoinTable
import jakarta.persistence.ManyToMany
import jakarta.persistence.Table



@Entity
@Table(name = "Proveedores")
class Proveedor(

    @Id
    val id: String,

    @Column
    val nombre: String,

    @ManyToMany
    @JoinTable(name = "Proveedor_Instituto")
    val institutos: List<Instituto>? = null

) {
    constructor():this("","")
}