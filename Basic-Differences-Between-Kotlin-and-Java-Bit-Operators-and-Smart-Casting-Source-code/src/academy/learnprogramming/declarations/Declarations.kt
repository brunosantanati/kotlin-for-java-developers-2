package academy.learnprogramming.declarations

typealias EmployeeSet = Set<Employee>

fun main(args: Array<String>)  {

    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)
    /*println(employeeOne === employeeTwo)
    println(employeeTwo === employeeThree)
    println(employeeOne == employeeTwo)
    println(employeeTwo == employeeThree)*/
    val employeeFour = employeeTwo
   /* println(employeeFour === employeeTwo)

    println(employeeFour != employeeTwo)
    println(employeeFour !== employeeTwo)
    println(employeeTwo != employeeThree)
    println(employeeTwo !== employeeThree)*/


    val x = 0x00101101
    val y = 0x11011011

    // Bit operators
    println(x or y)
    println(x xor y)
    println(x and y)

    var something: Any = employeeFour
    if (something is Employee) {
        //val newEmployee = something as Employee //It's not necessary because the smart cast
        //println(newEmployee.name)

        //something = employeeOne //It's OK since something is an employee
        println(something.name)
    }


/*    var number: Int
    number = 10;
    number = 20

    val names = arrayListOf("John", "Jane", "Mary")
    println(names[1])

    val employees: EmployeeSet

    val employee1 = Employee("Lynn Jones", 500)
    employee1.name = "Lynn Smith"

    val employee2: Employee
    val number2 = 100

    if (number < number2) {
        employee2 = Employee("Jane Smith", 400)
    }
    else {
        employee2 = Employee("Mike Watson", 150)
    }*/
}

class Employee(var name: String, val id : Int) {

    override fun equals(obj: Any?): Boolean {
        if (obj is Employee) {
            return name == obj.name && id == obj.id
        }

        return false
    }

}


