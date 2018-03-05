package laughedelic.sbt.atom

import sbt._

case object AtomPackage extends AutoPlugin {

  override def trigger = noTrigger
  override def requires =
    AtomPackageJson &&
    AtomPackageVersion &&
    AtomPackageRelease

}
