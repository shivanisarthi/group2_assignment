package db

import com.knoldus.db.CompanyReadDto
import org.scalatest.FunSuite

class TestCompanyReadDTo extends FunSuite(){

  val companyReadDtoObject = new CompanyReadDto()

  test("Should return true if Knoldus exist"){
    assert(companyReadDtoObject.getCompanyByName("Knoldus") != None)
  }

  test("Should return true if Philips exist"){
    assert(companyReadDtoObject.getCompanyByName("Philips") != None)
  }

  test("Should return false if LemonTree does not exist"){
    assert(companyReadDtoObject.getCompanyByName("LemonTree") === None)
  }
}