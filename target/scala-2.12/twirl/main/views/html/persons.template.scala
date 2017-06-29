
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object persons extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(persons: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""
"""),_display_(/*2.2*/main("数据库查询")/*2.15*/{_display_(Seq[Any](format.raw/*2.16*/("""
    """),format.raw/*3.5*/("""<ul>
      """),_display_(/*4.8*/persons/*4.15*/.map/*4.19*/{msg =>_display_(Seq[Any](format.raw/*4.26*/(""" """),format.raw/*4.27*/("""<li>"""),_display_(/*4.32*/msg),format.raw/*4.35*/("""</li>""")))}),format.raw/*4.41*/("""
    """),format.raw/*5.5*/("""</ul>
""")))}))
      }
    }
  }

  def render(persons:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(persons)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (persons) => apply(persons)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jun 29 11:16:56 CST 2017
                  SOURCE: D:/workSpace/playLearn/app/views/persons.scala.html
                  HASH: 7c8c110def49850ee20571fd46bbeb26c0425ad5
                  MATRIX: 737->1|855->24|883->27|904->40|942->41|974->47|1012->60|1027->67|1039->71|1083->78|1111->79|1142->84|1165->87|1201->93|1233->99
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|29->4|29->4|29->4|29->4|29->4|29->4|29->4|29->4|30->5
                  -- GENERATED --
              */
          