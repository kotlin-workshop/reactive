package com.thoughtworks.kotlin.reactive.domain

data class Employee(var id: Int, var name: String, var salary: Int) {
    var organizationId: Int? = null
    var departmentId: Int? = null
    constructor(id: Int, name: String, salary: Int, organizationId: Int, departmentId: Int) : this(id, name, salary) {
        this.organizationId = organizationId
        this.departmentId = departmentId
    }
    constructor(id: Int, name: String, salary: Int, organizationId: Int) : this(id, name, salary) {
        this.organizationId = organizationId
    }
}