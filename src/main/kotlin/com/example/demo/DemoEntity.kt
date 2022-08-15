package com.example.demo

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class DemoEntity (
    var title: String,
    var content: String,
    @Id @GeneratedValue var id: Long? = null)