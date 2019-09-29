package com.home.akka

import akka.actor.ActorRef
import akka.util.Timeout

import scala.concurrent.ExecutionContext

trait ApplicationApi {

  def createCoachella(): ActorRef

  implicit def executionContext: ExecutionContext
  implicit def requestTimeout: Timeout

  def createTestingEvent();

}
