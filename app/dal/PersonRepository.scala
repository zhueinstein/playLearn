package dal

import javax.inject.Inject

import play.api.db.slick.DatabaseConfigProvider

import scala.concurrent.ExecutionContext

/**
  * Created by admin on 2017/6/30.
  */
@Singleton
class PersonRepository @Inject()(dbConfigProvider: DatabaseConfigProvider)(implicit ec: ExecutionContext){

}
