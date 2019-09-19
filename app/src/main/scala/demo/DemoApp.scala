package demo

import com.typesafe.config.ConfigFactory

class DemoApp {
  private val config = ConfigFactory.load()

  def getVersion(): String = {
    config.getString("app.version")
  }
}