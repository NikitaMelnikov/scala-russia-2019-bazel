package demo

import org.scalatest.{FlatSpecLike, Matchers}

class DemoAppTest extends FlatSpecLike with Matchers {
  behavior of "DemoApp"

  it should "returns application version" in {
    val app = new DemoApp()

    app.getVersion() shouldBe "2.0"
  }
}