package org.example.tolearn2

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table


@Entity
@Table(name = "Proveedores")
class Proveedor(


    @Column
    val nombre: String,

    @Column
    @OneToMany(mappedBy = "id")
    val productos : List<Producto>,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id:Long? = null,
) {
}