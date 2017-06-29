
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/workSpace/playLearn/conf/routes
// @DATE:Thu Jun 29 16:09:02 CST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
