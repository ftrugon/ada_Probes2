package org.example

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToOne
import jakarta.persistence.Table

@Entity
@Table(name = "Directores")
class Director(

    @Id
    val dni: String,

    @Column
    val nombre: String,

    @Column
    val apellido: String,

    @OneToOne
    @JoinColumn(name = "id_Instituto")
    val instituto: Instituto? = null

) {
    constructor():this("","","")
}