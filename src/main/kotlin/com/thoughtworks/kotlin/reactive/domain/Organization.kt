package com.thoughtworks.kotlin.reactive.domain

import com.thoughtworks.kotlin.reactive.domain.Department
import com.thoughtworks.kotlin.reactive.domain.Employee

class Organization(var id: Int, var name: String) {
    var employees: MutableList<Employee> = ArrayList()
    var departments: MutableList<Department> = ArrayList()
    constructor(id: Int, name: String, employees: MutableList<Employee>, departments: MutableList<Department>) : this(id, name){
        this.employees.addAll(employees)
        this.departments.addAll(departments)
    }
    constructor(id: Int, name: String, employees: MutableList<Employee>) : this(id, name){
        this.employees.addAll(employees)
    }
}
