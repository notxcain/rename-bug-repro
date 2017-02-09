package foo.bar.sna

import foo.bar.baz.RenameMe
import io.foo.bar.baz.RenameMe

class Repro {
  def op(r: RenameMe): Unit = r match {
    case RenameMe.ChildA => ()
    case RenameMe.ChildB => ()
  }
}
