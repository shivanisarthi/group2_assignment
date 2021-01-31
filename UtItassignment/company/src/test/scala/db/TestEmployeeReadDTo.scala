package db

import com.knoldus.db.EmployeeReadDto
import org.scalatest.FunSuite

class TestEmployeeReadDTo extends FunSuite(){

  val employeeReadDtoObject = new EmployeeReadDto()

  test("Should return true if hari exist"){
    assert(employeeReadDtoObject.getEmployeeByName("hari") != None)
  }

  test("Should return true if himani exist"){
    assert(employeeReadDtoObject.getEmployeeByName("himani") != None)
  }

  test("Should return false if Susan does not exist"){
    assert(employeeReadDtoObject.getEmployeeByName("susan") === None)
  }
}