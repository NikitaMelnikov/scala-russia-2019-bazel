package demo

import com.typesafe.scalalogging.LazyLogging
import demo.DemoService.GreetingsServiceGrpc
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder

object DemoAppStarter extends App with LazyLogging {
  val app = new DemoApp()
  logger.info(s"Application version: ${app.getVersion()}")

  val server = NettyServerBuilder
    .forPort(9000)
    .addService(GreetingsServiceGrpc.bindService(new MyDemoService(), scala.concurrent.ExecutionContext.Implicits.global))
    .build()
    .start()

  server.awaitTermination()
}
