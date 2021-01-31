import com.knoldus.db.{ UserReadDto}
import com.knoldus.validator.{CompanyValidator, EmailValidator, UserValidator}
import org.scalatest.FunSuite
class Usertest extends FunSuite{
  val emailValOb = new  EmailValidator()

  val UserOb= new UserValidator()
  val UserDbOb = new UserReadDto()

  test("Should return true if emailid and company exist"){
    assert(UserOb.userIsValid(UserDbOb.User1)&& emailValOb.emailIdIsValid(emailId = "shivani.sarthi@knoldus.com")===true)}

}