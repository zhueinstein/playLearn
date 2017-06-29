
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
/*1.2*/import models.Book

object books extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Book],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(books:List[Book]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.20*/("""

"""),_display_(/*5.2*/main("Welcome to Play")/*5.25*/ {_display_(Seq[Any](format.raw/*5.27*/("""
  """),format.raw/*6.3*/("""<ul>
    """),_display_(/*7.6*/books/*7.11*/.map/*7.15*/{ book =>_display_(Seq[Any](format.raw/*7.24*/("""
          """),format.raw/*8.11*/("""<li>作者：<span>"""),_display_(/*8.25*/book/*8.29*/.author),format.raw/*8.36*/("""</span>书名：<span>"""),_display_(/*8.53*/book/*8.57*/.name),format.raw/*8.62*/("""</span></li>
    """)))}),format.raw/*9.6*/("""
  """),format.raw/*10.3*/("""</ul>
""")))}),format.raw/*11.2*/("""
"""))
      }
    }
  }

  def render(books:List[Book]): play.twirl.api.HtmlFormat.Appendable = apply(books)

  def f:((List[Book]) => play.twirl.api.HtmlFormat.Appendable) = (books) => apply(books)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Jun 29 11:04:51 CST 2017
                  SOURCE: D:/workSpace/playLearn/app/views/books.scala.html
                  HASH: 46d448dbc8b0581b721b5d7621e3e0a83d261b68
                  MATRIX: 432->1|759->24|872->42|902->47|933->70|972->72|1002->76|1038->87|1051->92|1063->96|1109->105|1148->117|1188->131|1200->135|1227->142|1270->159|1282->163|1307->168|1355->187|1386->191|1424->199
                  LINES: 17->1|22->3|27->3|29->5|29->5|29->5|30->6|31->7|31->7|31->7|31->7|32->8|32->8|32->8|32->8|32->8|32->8|32->8|33->9|34->10|35->11
                  -- GENERATED --
              */
          