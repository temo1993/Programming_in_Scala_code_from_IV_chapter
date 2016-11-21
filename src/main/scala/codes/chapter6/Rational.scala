package codes.chapter6

class Rational(n: Int, d: Int) {
  require(d != 0)


  private val g = gcd(n.abs, d.abs)
  val numer : Int = n/g
  val denom : Int = d/g

  private def gcd(a: Int, b: Int): Int = // gcd - Greatest common divisor
    if(b==0) a else gcd(b, a%b)

  def this(n: Int) = this(n, 1) // auxiliary constructor

  override def toString = numer + "/" + denom

  def add(that: Rational): Rational =
    new Rational(numer * that.denom + that.numer * denom,
      denom * that.denom)

  def lessThan(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) =
    if (this.lessThan(that)) that else this

  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def + (i: Int): Rational =
    new Rational(numer + i * denom, denom)
  def - (that: Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )
  def - (i: Int): Rational =
    new Rational(numer - i * denom, denom)
  def * (that: Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)
  def * (i: Int): Rational =
    new Rational(numer * i, denom)
  def / (that: Rational): Rational =
    new Rational(numer * that.denom, denom * that.numer)
  def / (i: Int): Rational =
    new Rational(numer, denom * i)
}

object Rational extends App{

  implicit def intToRational(x: Int) : Rational = new Rational(x)

  val x = new Rational(1,2)
  println(s"${x.numer} ${x.denom}")
  println(x)
  val x1 = new Rational(2,3)
  println(x1)
  println(x.add(x1))

  println()
  println("Using auxiliary constructor")
  val y = new Rational(3)
  println(y)
  println(x+x1)
  println(x*2)
  println(2*x)
}