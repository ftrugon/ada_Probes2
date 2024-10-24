package org.example

import org.hibernate.annotations.ManyToAny
import org.hibernate.boot.model.source.spi.PluralAttributeMapKeyManyToAnySource

class DepartamentoRepository(

) {


    fun insertDepart(depart: Departamento){
        val em = EntityManagerFactory.generateEntityManager()

        em.transaction.begin()
        try {

            val exist = selectAllDeparts().find { it.nombre == depart.nombre && it.instituto?.id == depart.instituto?.id }
            if (exist == null){
                em.persist(depart)
                em.transaction.commit()
            }else {
                println("You have inserted an existent Department")
                em.transaction.rollback()
            }

        }catch (e: Exception){
            em.transaction.rollback()
        }

        em.close()
    }


    fun selectAllDeparts(): List<Departamento>{

        val em = EntityManagerFactory.generateEntityManager()
        em.transaction.begin()

        var departList : List<Departamento> = listOf()

        try {
            departList = em.createQuery("FROM Departamento", Departamento::class.java).resultList
            em.transaction.commit()
        }catch (e: Exception){
            em.transaction.rollback()
        }

        em.close()

        return departList
    }


    fun selectDepart(id: Long): Departamento?{
        val em = EntityManagerFactory.generateEntityManager()

        var departToReturn : Departamento? = null

        em.transaction.begin()

        try {
            departToReturn = em.find(Departamento::class.java,id)
            em.transaction.commit()
        }catch (e: Exception){
            departToReturn = null
            em.transaction.rollback()
        }

        em.close()
        return departToReturn
    }

    fun updateDepart(id: Long, newName: String){
        val em = EntityManagerFactory.generateEntityManager()


        em.transaction.begin()

        try {
            val departToMod = em.find(Departamento::class.java,id)
            departToMod.nombre = newName
            em.transaction.commit()
        }catch (e: Exception){
            em.transaction.rollback()
        }

        em.close()
   }

    fun deleteDepart(id: Long){
        val em = EntityManagerFactory.generateEntityManager()


        em.transaction.begin()

        try {
            val departToDel = em.find(Departamento::class.java,id)
            em.remove(departToDel)
            em.transaction.commit()
        }catch (e: Exception){
            em.transaction.rollback()
        }

        em.close()
    }

}