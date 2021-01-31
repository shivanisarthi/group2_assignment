object Palindrome extends FunctionClass{

  override def Factorial(n: Int): Int = {
    if (n == 0)
      return 1
    else
      return n * Factorial(n-1)
  }
  override def PalindromeCheck(num: Int): Boolean = {
 val Convert = num.toString
    if(Convert.equals(Convert.reverse))
      return true
    else
      return false

  }
}
