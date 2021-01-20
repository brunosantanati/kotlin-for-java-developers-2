package academy.learnprogramming.declarations

typealias EmployeeSet = MutableSet<Employee>

fun main(args: Array<String>)  {

    var number: Int
    number = 10;
    number = 20

    val employees: EmployeeSet = mutableSetOf()

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Jane Smith", 400)
    }
    else {
        employee2 = Employee("Mike Watson", 150)
    }

    employees.add(employee1)
    employees.add(employee2)

    println(employees)
}

data class Employee(var name: String, val id : Int) {

}


