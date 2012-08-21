package controllers

import play.api._
import play.api.mvc._
import play.api.libs.iteratee.Enumerator

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  def test = Action {
  	SimpleResult(
  		header = ResponseHeader(200, Map(CONTENT_TYPE -> "text/plain")),
  		body = Enumerator("This is a test!")
  	)
  }
  
  def test2 = Action {
    Ok(views.html.test2())
  }
}