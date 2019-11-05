package controllers

import play.api.mvc._
import play.twirl.api.Html

class Home(cc: ControllerComponents) extends AbstractController(cc) {
  def index = Action {
    Ok(views.html.main.home())
  }
}
