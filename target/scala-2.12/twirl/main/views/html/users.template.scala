
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

object users extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(msg: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""
"""),_display_(/*2.2*/main("测试数据查询")/*2.16*/{_display_(Seq[Any](format.raw/*2.17*/("""
    """),format.raw/*3.5*/("""<h1>"""),_display_(/*3.10*/msg),format.raw/*3.13*/("""</h1>
""")))}))
      }
    }
  }

  def render(msg:String): play.twirl.api.HtmlFormat.Appendable = apply(msg)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (msg) => apply(msg)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jun 29 11:04:51 CST 2017
                  SOURCE: D:/workSpace/playLearn/app/views/users.scala.html
                  HASH: 0859081d5c86480198cbaf1ecdbc2bea022ecc1c
                  MATRIX: 729->1|837->14|865->17|887->31|925->32|957->38|988->43|1011->46
                  LINES: 21->1|26->1|27->2|27->2|27->2|28->3|28->3|28->3
                  -- GENERATED --
              */
          