package com.thoughtworks.kotlin.reactive.demo

import org.reactivestreams.Subscriber
import org.reactivestreams.Subscription
import reactor.core.publisher.Flux

//Subscribe to a flux, and add those elements into a list. Print the list
//1. Use subscriber interface
//2. Use short version
fun main(args: Array<String>) {

    val elements = mutableListOf<Int?>()
    val elements1 = mutableListOf<Int?>()


    val publisher = Flux.just(1, 2, 3)

    publisher.log().subscribe(object: Subscriber<Int?>{
        override fun onComplete() {
        }

        override fun onSubscribe(s: Subscription) {
            s.request(10)
        }

        override fun onNext(t: Int?) {
            elements.add(t)
        }

        override fun onError(t: Throwable?) {
        }
    })

    println(elements)


    publisher.log().subscribe { elements1.add(it)}

    println(elements1)


}





//Log the operations