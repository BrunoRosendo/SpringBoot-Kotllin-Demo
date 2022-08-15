package com.example.demo

import org.springframework.data.repository.CrudRepository

interface DemoRepository : CrudRepository<DemoEntity, Long> {
    fun findByTitle(title: String): DemoEntity?
}
