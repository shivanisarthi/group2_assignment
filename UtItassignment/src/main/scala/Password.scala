object Password {
  def Valid(pwd: String): Boolean = {

    if(pwd.matches("(^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,15}$)"))
return true
    else
      return false
  }
}