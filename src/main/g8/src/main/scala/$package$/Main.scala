package $package$

import com.typesafe.scalalogging.StrictLogging

import cats.instances.string._
import cats.syntax.semigroup._

object Main extends App with StrictLogging {
  logger.info("Hello " |+| "Cats!")
}