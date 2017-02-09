package foo.baz

import foo.bar.RenameMe

class Repro {
  def op(r: RenameMe): Unit = r match {
    case RenameMe.ChildA => ()
    case RenameMe.ChildB => ()
  }
}
