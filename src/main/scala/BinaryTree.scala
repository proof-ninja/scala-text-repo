object BinaryTree {                   //クラス内で定義されたメソッドはクラスのインスタンスを作成しなければ呼び出すことができないので、Objectにする。

  sealed abstract class Tree
  case class Branch(value: Int, left: Tree, right: Tree) extends Tree
  case object Empty extends Tree

  def max(tree: Tree): Int = tree match {
    case Branch(value, Empty, Empty) =>
      value
    case Branch(value, left, Empty) =>
      val l = max(left)
      if (value > l) value else l
    case Branch(value, Empty, right) =>
      val r = max(right)
      if (value > r) value else r
    case Branch(value, left, right) =>
      val l = max(left)
      val r = max(right)
      if (value > r) {
        if (value > l) value else l
      } else {
        if (r > l) r else l
      }
    case Empty => 0
  }
  def min(tree: Tree): Int = tree match {
    case Branch(value, Empty, Empty) =>
      value
    case Branch(value, left, Empty) =>
      val l = min(left)
      if (value < l) value else l
    case Branch(value, Empty, right) =>
      val r = min(right)
      if (value < r) value else r
    case Branch(value, left, right) =>
      val l = min(left)
      val r = min(right)
      if (value < r) {
        if (value < l) value else l
      } else {
        if (r < l) r else l
      }
    case Empty => 0                                  //throw new RuntimeException
  }
  def depth(tree: Tree): Int = tree match {
    case Branch(value, Empty, Empty) =>
      1
    case Branch(value, left, right) =>
      val ldep: Int = depth(left): Int               //depth()で深さを得られる
      val rdep:Int = depth(right): Int
      if(ldep > rdep) ldep + 1 else rdep + 1
    case Empty =>                                    //throw new RuntimeException
      0
  }
}

object BinaryTreeMain {
  def main(args: Array[String]): Unit = {
    val tree = BinaryTree.Branch(10, BinaryTree.Branch(20,
      BinaryTree.Empty,
      BinaryTree.Empty
    ), BinaryTree.Branch(30,
      BinaryTree.Branch(40,
        BinaryTree.Empty,
        BinaryTree.Empty
      ),
      BinaryTree.Empty))


    println(BinaryTree.max(tree))
    println(BinaryTree.min(tree))
    println(BinaryTree.depth(tree))
  }
}
