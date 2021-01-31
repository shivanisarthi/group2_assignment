package com.knoldus.db

import com.knoldus.models.User

import scala.collection.immutable.HashMap

class UserReadDto{

  val User1: User = User("shivani","sarthi","Knoldus","shivani.sarthi@knoldus.com")
  val User2: User = User("kapil","jeet singh","Philips","kapiljeetsingh@gmail.com")
  val users: HashMap[String, User] = HashMap("shivani" -> User1, "kapil" -> User2)

  def getUserByName(name: String): Option[User] = users.get(name)

}

