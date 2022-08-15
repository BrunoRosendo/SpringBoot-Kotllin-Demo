package com.example.demo

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HtmlController(private val repository: DemoRepository) {

    @GetMapping("/")
    fun demo(): String? {
        val entity = repository.findByTitle("Ola malta")
        return entity?.title + " " + entity?.content
    }

    @GetMapping("/new")
    fun demoNew() {
        repository.save(DemoEntity(
            title="Ola malta",
            content="Mas que granda site"
        ))
    }
}