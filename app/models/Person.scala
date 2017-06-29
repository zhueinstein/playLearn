package models

import slick.driver.MySQLDriver.api._
import slick.lifted.Tag
/**
  * Created by admin on 2017/6/29.
  */
class Person(tag: Tag) extends Table[(Long, String, String)](tag, "PERSON"){
	def id = column[Long]("id", O.PrimaryKey)
	def name = column[String]("name")
	def address = column[String]("address")

	def * = (id, name, address)

}
