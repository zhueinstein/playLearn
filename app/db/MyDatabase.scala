package db

import play.api.Configuration
import slick.jdbc.JdbcBackend.Database
/**
  * Created by admin on 2017/6/29.
  */
object MyDatabase {

	/**
	  * init configuration from application.conf.
	  * <b>Only user in play Application</b>
	  */
	private val conf = Configuration.apply()

	private val dbUrl = conf.get[String]("db.test.url")

	private val user = conf.get[String]("db.test.user")

	private val pwd = conf.get[String]("db.test.password")

	private val driverClass = conf.get[String]("db.default.driver")

	/**
	  * create the database instance  with configuration
	  */
	val database = Database.forURL(dbUrl, user, pwd,null, driver = driverClass)

}
