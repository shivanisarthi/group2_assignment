import com.knoldus.models.{Company, User}
import com.knoldus.request.{CompanyImpl, UserImpl}
import com.knoldus.validator.{CompanyValidator, EmailValidator, UserValidator}
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.AsyncFlatSpec

class UnitTestUser extends AsyncFlatSpec {
  val users= User("shivani","sarthi","Knoldus","shivani.sarthi@knoldus.com")

  "A user " should " exist in the database" in {
    val mockVal = mock[UserValidator]
    when(mockVal.userIsValid(users)) thenReturn false

    val userimpl = new UserImpl(mockVal)

    val result = userimpl.createUser(users)
    assert(result.isEmpty)
  }
  it should "have a email id that exist " in{
    val emailvalid=new EmailValidator
    assert(emailvalid.emailIdIsValid(users.emailId))
  }
}