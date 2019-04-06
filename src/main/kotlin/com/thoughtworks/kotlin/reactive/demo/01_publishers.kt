package com.thoughtworks.kotlin.reactive.demo

import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.util.function.Predicate

//Produce a stream of data






//Define a stream with 3 integers
fun main(args: Array<String>) {
    Flux.just(1, 2, 3)

    val numbers = listOf(1, 2, 3, 4)
    Flux.fromIterable(numbers)


    Mono.just("Alice")
}


//Define a stream with one string