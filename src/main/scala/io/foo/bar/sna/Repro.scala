package io.foo.bar.sna

import io.foo.bar.baz.RenameMe

class Repro {
  def op(r: RenameMe): Unit = r match {
    case RenameMe.ChildA => ()
    case RenameMe.ChildB => ()
  }
}
