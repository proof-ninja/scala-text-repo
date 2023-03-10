import scala.io.{BufferedSource, Source}
import scala.util.Using

object FoldLeft2 {
  def main(args: Array[String]): Unit = {
    printFile("C:\\Users\\user\\scala\\scala-sandbox")
  }

  def withFile[A](filename: String)(f: BufferedSource => A): A = { // 関数fを引数として受け取る。fはBufferedSourceオブジェクトを受け取り、任意の型Aを返す関数
    Using.resource(Source.fromFile(filename)) { s =>
      f(s) // f(s) を f(s.buffered) に変更
    }
  }

  def printFile(filename: String): Unit = {
    withFile(filename) { file =>
      file.getLines.foreach(println)
    }
  }
}
