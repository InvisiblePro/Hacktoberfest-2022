object CircleArea {
  val PI = 22/7;

  def main(args: Array[String]): Unit = {
    var r = 5;
    println("Area of the circle " + r + " is " + getArea(r));
  }

  def getArea(r: Int): Double = {
    PI*r*r;
  }
}