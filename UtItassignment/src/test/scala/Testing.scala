import org.scalatest.FunSuite;
class Testing extends FunSuite{
  test("Should return true if password is valid") {
    assert(Password.Valid(pwd = "MOVEbox@123") === true)
}




}