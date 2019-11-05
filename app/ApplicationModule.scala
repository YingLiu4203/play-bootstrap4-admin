
import controllers.Home
import play.api.i18n.Langs
import play.api.mvc.ControllerComponents

trait ApplicationModule {

  import com.softwaremill.macwire._

  lazy val home = wire[Home]

  def langs: Langs

  def controllerComponents: ControllerComponents
}
