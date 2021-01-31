import com.knoldus.models.Company
import com.knoldus.request.CompanyImpl
import com.knoldus.validator.{CompanyValidator, EmailValidator}
import org.mockito.MockitoSugar.{mock, when}
import org.scalatest.AsyncFlatSpec

class UnitTestCompany extends AsyncFlatSpec {
  val comp= Company("Knoldus", "knoldus@gmail.com", "Noida")

  "A company " should " not already exist in database" in {
    val mockedCValidator = mock[CompanyValidator]
    when(mockedCValidator.companyIsValid(comp)) thenReturn true

    val compimplement = new CompanyImpl(mockedCValidator)

    val result = compimplement.createCompany(comp)
    assert(!(result.isEmpty))
  }
  it should "have a email id that exist" in{
    val emailvalid=new EmailValidator
    assert(emailvalid.emailIdIsValid(comp.emailId))
  }
}