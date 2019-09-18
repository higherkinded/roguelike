package main


import zio.App
import zio.console._


object Main extends App {

  def run(args: List[String]) = main.fold(_ => 1, _ => 0)

  lazy val main =
    for {
      _ <- getStrLn
    } yield 0

}
