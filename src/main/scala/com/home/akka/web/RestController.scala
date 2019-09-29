package com.home.akka.web

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.http.scaladsl.model._
import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.stream.ActorMaterializer
import com.home.akka.ApplicationApi

//https://medium.com/@ian.shiundu/building-a-fully-functional-rest-service-using-akka-actors-8b5c12978380
object RestController {

  val route =
    path("test") {
      get {
        complete(m =)
        )
      }
    }


  def createRouter(): Unit = {
    println("wowowowo")
    Http().bindAndHandle(route, "localhost", 8080)
  }

  def test(param: String): String = {
    return "You said " + param
  }

}

trait RestRoutes extends ApplicationApi {

  protected val createTestRoute : Route {
      pathPrefix(service / version / test / Param)
  }

}
