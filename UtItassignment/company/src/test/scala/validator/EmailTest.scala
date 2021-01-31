import com.knoldus.db.{CompanyReadDto, UserReadDto}
import com.knoldus.validator.{EmailValidator}
import org.scalatest.FunSuite
class Emailtest extends FunSuite{
  val emailValOb = new  EmailValidator()

  test("Should return true if emailid is valid"){
    assert(emailValOb.emailIdIsValid(emailId = "shivani.sarthi@knoldus.com")===true)
  }

}