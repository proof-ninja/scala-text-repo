import scala.io.Source

class WithFile {
  def withFile[A](filename: String) (f: Source => A): A = { //関数fを引数として受け取る。fはSourceオブジェクトを受け取り、任意の型Aを返す関数
    val s = Source.fromFile(filename)                       //引数filenameにファイル名を指定するとファイルを開き、読み取り可能な「Source」オブジェクトを作成
    try {
      f(s)                                                  //f(s) //「f」関数を呼び出し、その結果を返す
    } finally {
      s.close()
      }
  }
  def printFile(filename: String): Unit = {
    withFile(filename) { file =>
      file.getLines.foreach(println)
    }
  }
}

//「try-finally」構文を使用することで、ファイルの読み取り中に例外が発生した場合でも、ファイルが正しく閉じられることが保証される




object Main {
  def main(args: Array[String]): Unit = {
    val withFile = new WithFile()                                         //WithFileクラスをインスタンス化して、printFileメソッドを呼び出すコードを作成
    withFile.printFile("C:\\Users\\user\\scala\\scala-sandbox")
  }
}
