import com.knoldus.db.{CompanyReadDto, UserReadDto}
import com.knoldus.validator.{CompanyValidator, EmailValidator, UserValidator}
import org.scalatest.FunSuite
class Companytest extends FunSuite{
  val emailValOb = new  EmailValidator()
  val companyReadDtoOb =new CompanyReadDto()
  val companyOb= new CompanyValidator()



  test("Should return true if company does not exist in database and email id is valid"){
    assert(!companyOb.companyIsValid(companyReadDtoOb.philipsCompany)&& emailValOb.emailIdIsValid(emailId = "shivani.sarthi@knoldus.com")=== true)
  }

}