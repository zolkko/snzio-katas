import zio.*


object Main extends ZIOAppDefault {

  override def run: RIO[Any, Unit] =
    ZIO.suspend(Console.printLine("ZIO hello world program compiled by Scala Native compiler"))

}
