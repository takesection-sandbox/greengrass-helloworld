package com.pigumer.lambda.helloworld

import java.io.IOException

import com.amazonaws.services.lambda.runtime.{Context, RequestHandler}

import scala.beans.BeanProperty

case class Input(@BeanProperty var message: String) {
  def this() = this(message = "")
}

case class Output(@BeanProperty var result: String) {
  def this() = this(result = "")
}

class HelloWorld extends RequestHandler[Input, Output] {

  @throws(classOf[IOException])
  override def handleRequest(input: Input, context: Context): Output = {
    implicit val logger = context.getLogger
    logger.log(input.message)

    new Output()
  }
}
