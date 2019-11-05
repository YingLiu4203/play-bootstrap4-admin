import play.api.i18n.Langs
import play.api.mvc.ControllerComponents
import controllers.{Home, UIElements, Utilities}

trait ApplicationModule {

  import com.softwaremill.macwire._

  lazy val home = wire[Home]
  lazy val uiElement = wire[UIElements]
  lazy val utilities = wire[Utilities]

  def langs: Langs

  def controllerComponents: ControllerComponents
}
