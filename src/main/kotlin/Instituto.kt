package org.example

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToMany
import jakarta.persistence.ManyToOne
import jakarta.persistence.OneToMany
import jakarta.persistence.OneToOne
import jakarta.persistence.Table

@Entity
@Table(name = "Institutos")
class Instituto(

    @Id
    val id: String,

    @Column
    val nombre: String,

    @ManyToOne
    @JoinColumn("Inspector")
    val Inspector: Inspector? = null,

    @OneToMany(mappedBy = "instituto")
    val departamentos: List<Departamento>? = null,

    @ManyToMany(mappedBy = "institutos")
    val proveedores: List<Proveedor>? = null,

    @OneToOne(mappedBy = "instituto")
    val director: Director? = null

    ) {
    constructor():this("","")
}