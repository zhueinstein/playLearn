package controllers

import javax.inject._

import db.MyDatabase

import scala.util.{Failure, Success}
import models.{Book, _}
import play.api.mvc._
import slick.driver.MySQLDriver.api._
import slick.jdbc.JdbcBackend

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future



/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject()( cc: ControllerComponents) extends AbstractController(cc) {

  /**
   * Create an Action to render an HTML page.
   *
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index() = Action { implicit request: Request[AnyContent] =>
    Ok(views.html.index())
  }

  def hello() = Action { implicit request: Request[AnyContent] =>
      Ok(views.html.hello("HelloWorld"));
  }

 /* def book() = Action{
    val book = Book("Scala", "moderSky")
    Ok(views.html.books(book))
  }*/

  def books() = Action{
    val books = List(Book("Java1111", "skl111"), Book("Scal11a", "moderSky"))
    Ok(views.html.books(books))
  }

  def slickQuery() = Action{
//     val db = JdbcBackend.Database.forURL("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=UTF-8&useSSL=true","root","123456",null,"com.mysql.jdbc.Driver")
     val db = MyDatabase.database
      val persons = TableQuery[Person]
      val personNames: Future[Seq[String]] = db.run(
          persons.map(_.name).result
      )

      var res = List[String]()
     personNames.onComplete {
         case Success(names) => {names.foreach{name =>res = name ::res}}
         case Failure(ex) => println("出错了！！",ex)

     }
      println(res)
    Ok(views.html.slickQuery(res))
  }

  /*def select()= Action{
    var outString = "Number is "
    val conn = db.getConnection()
    try {
        val res = conn.createStatement().executeQuery("select 9 as testKey")
        while(res.next()){
          outString += res.getString("testKey")
        }
        Ok(views.html.users(outString))
     }finally {
      conn.close();
     }
  }*/

    /*def selectJdbc = Action{
        val conn = db.getConnection()
        try {
            val res = conn.createStatement().executeQuery("select * from person")
            var list = List[String]("a", "v", "s", "b")
            while (res.next()) {
                val name = res.getString("name")
                val address = res.getString("address")
                println(s"姓名: $name, 地址: $address")
                list = (s"姓名: $name, 地址: $address") :: list
            }
            Ok(views.html.persons(list))
        }finally {
                conn.close()
        }
    } */
 /*   def selectJdbc = Action{
        val database = JdbcBackend.Database.forURL("jdbc:mysql://127.0.0.1:3306/slickQuery?characterEncoding=UTF-8&useSSL=true","root","123456",null,"com.mysql.jdbc.Driver")


    }*/

  /*  def ebeanTest = Action{
        Database
        Ok();
    }*/
}
