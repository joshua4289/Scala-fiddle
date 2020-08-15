case class Email(from:String,body:String)
val importantPeople = Set("wife@home.com","boss@office.com")
val importantEmail = Email("boss@office.com","We need to talk!")


val regularEmail = Email("marketing@google.com","Read our transparency report ")


// now for the function to check who sent the email
// and the body of it
// case with a condition statement
// the condition is the 'guard'
def alertOrNoAlert(email: Email): Unit = email match{
  case Email(from ,_) if importantPeople.contains(from) => println("This email needs your attention ")
  case Email(_,_) => println("do not disturb")
}

alertOrNoAlert(regularEmail)

alertOrNoAlert(importantEmail)