package db

import slick.jdbc.JdbcBackend.Database
import slick.jdbc.JdbcBackend.Session
import play.api.Play.current
import slick.jdbc.JdbcBackend
/**
  * Created by admin on 2017/6/29.
  */
object MyDatabase {

	/**
	  * init configuration from application.conf.
	  * <b>Only user in play Application</b>
	  */
	private val conf = current.configuration

	private val dbUrl = conf.getString("db.test.url").getOrElse("")

	private val user = conf.getString("db.test.user").getOrElse("root")

	private val pwd = conf.getString("db.test.password").getOrElse("123456")

	private val driverClass = conf.getString("db.default.driver").getOrElse("com.mysql.jdbc.Driver")

	/**
	  * create the database instance  with configuration
	  */
	val database = Database.forURL(dbUrl, user, pwd,null, driver = driverClass)

}
