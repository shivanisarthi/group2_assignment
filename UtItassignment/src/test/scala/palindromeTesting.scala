import org.scalatest.FunSuite

class palindromeTesting extends FunSuite{
  test("Should return true if number is palindrome"){
    assert(Palindrome.PalindromeCheck(2213122)===true)
  }
  test("Factorial of 0 should be 1"){
    assert(Palindrome.Factorial(0)===1)
  }
}