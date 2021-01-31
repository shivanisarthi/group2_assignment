package com.knoldus.db
import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class EmployeeReadDto {

  val Employee1: Employee = Employee("himani","sarthi", 23,12000, "Trainee","Knoldus","himani.sarthi@knoldus.com")
  val Employee2: Employee = Employee("hari","jeet singh", 24,32000, "Assistant Manager","Philips","harijeetsingh@gmail.com")
  val employees: HashMap[String, Employee] = HashMap("himani" -> Employee1, "hari" -> Employee2)
  def getEmployeeByName(name: String): Option[Employee] = employees.get(name)


}
