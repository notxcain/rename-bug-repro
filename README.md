# How to reproduce
1. Perform rename refactoring of `foo.bar.RenameMe` trait.
2. Go to `foo.baz.Repro` to see the bug (a `$` is appended to companion object import)

Looks like it this bug appears when you reference renamed trait / class inside sibling package