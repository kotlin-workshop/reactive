package examples

import com.thoughtworks.kotlin.reactive.domain.Department
import com.thoughtworks.kotlin.reactive.domain.Employee
import com.thoughtworks.kotlin.reactive.domain.Organization
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

class Part03Merge {
    fun createOrganization(firstStream: Flux<Department>, secondStream: Flux<Department>): Mono<Organization> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun createEmployees(names: Flux<String>, salaries: Flux<Int>): Flux<Employee> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun createDepartment(names: Flux<String>, salaries: Flux<Int>): Mono<Department> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
