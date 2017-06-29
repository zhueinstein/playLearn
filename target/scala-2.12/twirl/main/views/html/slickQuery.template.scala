
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

object slickQuery extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(msg: List[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""

"""),_display_(/*3.2*/main("slickShow")/*3.19*/{_display_(Seq[Any](format.raw/*3.20*/("""
  """),format.raw/*4.3*/("""<h2>
    <ul>
      """),_display_(/*6.8*/msg/*6.11*/.map/*6.15*/{ name =>_display_(Seq[Any](format.raw/*6.24*/(""" """),format.raw/*6.25*/("""<li>"""),_display_(/*6.30*/name),format.raw/*6.34*/("""</li>""")))}),format.raw/*6.40*/("""
    """),format.raw/*7.5*/("""</ul>
  </h2>
""")))}))
      }
    }
  }

  def render(msg:List[String]): play.twirl.api.HtmlFormat.Appendable = apply(msg)

  def f:((List[String]) => play.twirl.api.HtmlFormat.Appendable) = (msg) => apply(msg)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jun 29 17:29:27 CST 2017
                  SOURCE: D:/workSpace/playLearn/app/views/slickQuery.scala.html
                  HASH: b00496f8bba6530772c599521583927e66196764
                  MATRIX: 740->1|854->20|884->25|909->42|947->43|977->47|1025->70|1036->73|1048->77|1094->86|1122->87|1153->92|1177->96|1213->102|1245->108
                  LINES: 21->1|26->1|28->3|28->3|28->3|29->4|31->6|31->6|31->6|31->6|31->6|31->6|31->6|31->6|32->7
                  -- GENERATED --
              */
          