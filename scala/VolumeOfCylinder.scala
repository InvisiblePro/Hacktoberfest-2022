object VolumeOfCylinder {
  val PI = 22/7;

  def main(args: Array[String]): Unit = {
    var r = scala.io.StdIn.readInt()
    println("Volume of the circle " + r + " is " + getVolume(r));
  }

  def getVolume(r: Int): Double = {
    (4/3)*PI*r*r*r;
  }
}
