package examples

import com.thoughtworks.kotlin.reactive.domain.Department
import com.thoughtworks.kotlin.reactive.domain.Employee
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

class Part02Transform {
    fun capitalizedNames(employees: Flux<Employee>): Flux<String> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun totalSalary(department: Mono<Department>): Mono<Int> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
