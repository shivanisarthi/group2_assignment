package db

import com.knoldus.db.UserReadDto
import org.scalatest.FunSuite

class TestUserReadDTo extends FunSuite(){

  val userReadDtoObject = new UserReadDto()

  test("Should return true if shivani exist"){
    assert(userReadDtoObject.getUserByName("shivani") != None)
  }

  test("Should return true if kapil exist"){
    assert(userReadDtoObject.getUserByName("kapil") != None)
  }

  test("Should return false if saurav does not exist"){
    assert(userReadDtoObject.getUserByName("saurav") === None)
  }
}