package org.example

import jakarta.persistence.Persistence
import org.example.tolearn2.Producto
import org.example.tolearn2.Proveedor
import org.example.tolearn2.Usuario
import java.time.Instant
import java.util.Date

fun main() {

    val inspector = Inspector("20601013l","carlos","ruiz",emptyList())

    val instituto = Instituto("123-123","IES Palamos",inspector)

    val director = Director("12345678ñ","Paco","Tabaco",instituto)

    val depart = Departamento("It",instituto)
    val depart2 = Departamento("Programacion",instituto)

    val proveedor = org.example.Proveedor("123-123-123","IAMPE",listOf(instituto))


    val dR = DepartamentoRepository()
//    dR.insertDepart(depart2)
//    dR.selectAllDeparts().forEach{
//        println("${it.id}, ${it.nombre}, ${it.instituto?.id}")
//    }

    dR.deleteDepart(3)
}