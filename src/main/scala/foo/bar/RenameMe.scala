package foo.bar

sealed abstract class RenameMe
object RenameMe {
  case object ChildA extends RenameMe
  case object ChildB extends RenameMe
}
