package demo

import demo.DemoService.{GreetingsRequest, GreetingsResponse, GreetingsServiceGrpc}

import scala.concurrent.Future

class DemoService extends GreetingsServiceGrpc.GreetingsService {
  override def getGreetings(request: GreetingsRequest): Future[GreetingsResponse] = Future.successful(GreetingsResponse(s"Hello, ${request.name}"))
}
