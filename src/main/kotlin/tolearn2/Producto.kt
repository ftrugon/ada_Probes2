package org.example.tolearn2

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import jakarta.persistence.Temporal
import jakarta.persistence.TemporalType
import java.util.Date


@Entity
@Table(name = "Productos")
class Producto(

    @Column
    val nombre: String,

    @Column
    val description: String,

    @Column
    val precio: Double,

    @Column
    @Temporal(TemporalType.DATE)
    val fechaAlta:Date,

    @ManyToOne
    @JoinColumn(name = "id_Proveedor")
    val proveedor: Proveedor? = null,

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

) {
}