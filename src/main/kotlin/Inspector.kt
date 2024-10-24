package org.example

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.OneToMany
import jakarta.persistence.Table


@Entity
@Table(name = "Inspectores")
class Inspector(

    @Id
    val dni: String,

    @Column
    var nombre: String,

    @Column
    var apellido: String,

    @Column
    @OneToMany(mappedBy = "id")
    val Institutos: List<Instituto>? = null

) {
    constructor():this("","","")
}