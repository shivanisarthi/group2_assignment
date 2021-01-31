  import com.knoldus.models.{Company, Employee}
  import com.knoldus.request.{CompanyImpl, EmployeeImpl}
  import com.knoldus.validator.{CompanyValidator, EmailValidator, EmployeeValidator}
  import org.mockito.MockitoSugar.{mock, when}
  import org.scalatest.AsyncFlatSpec

  class UnitEmployee extends AsyncFlatSpec {
    val emp= Employee("himani","sarthi", 23,12000, "Trainee","Knoldus","himani.sarthi@knoldus.com")

    "An Employee's company name " should " present in database" in {
      val mockedEValidator = mock[EmployeeValidator]
      when(mockedEValidator.employeeIsValid(emp)) thenReturn true

      val empimpl = new EmployeeImpl(mockedEValidator)

      val result = empimpl.createEmployee(emp)
      assert(!(result.isEmpty))
    }
    "Employees email id " should "have a valid email address" in{
      val emailvalid=new EmailValidator
      assert(emailvalid.emailIdIsValid(emp.emailId))
    }
}
