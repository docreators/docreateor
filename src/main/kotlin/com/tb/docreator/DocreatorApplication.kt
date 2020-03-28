package com.tb.docreator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DocreatorApplication

fun main(args: Array<String>) {
	runApplication<DocreatorApplication>(*args)
}
