
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workSpace/playLearn/conf/routes
// @DATE:Thu Jun 29 16:09:02 CST 2017

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def hello(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hello")
    }
  
    // @LINE:11
    def slickQuery(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "slickQuery")
    }
  
    // @LINE:10
    def books(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books")
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:15
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
