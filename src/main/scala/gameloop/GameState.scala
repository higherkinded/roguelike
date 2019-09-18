package gameloop


import zio._
import zio.console._
import scalaz._


package object gamestate {

  case class GameState(
    name: String = "Noname"
  )

}
