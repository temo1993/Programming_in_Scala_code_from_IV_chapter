package codes.chapter5

object RawString extends App{

println("""Welcome to Ultamix 3000.
           Type "HELP" for help.""")
/*However, running this code does not produce quite what is desired:
  Welcome to Ultamix 3000.
Type "HELP" for help.*/
 /** The issue is that the leading spaces before the second line are included in the string! To help with this
common situation, you can call stripMargin on strings. To use this method, put a pipe character (|) at
  the front of each line, and then call stripMargin on the whole string:*/
  println("""|Welcome to Ultamix 3000.
             |Type "HELP" for help.""".stripMargin)
/*Now the code behaves as desired:
  Welcome to Ultamix 3000.
Type "HELP" for help.*/
  val symbol: Symbol = 'thisIsSymbol
  println()



  // STRING INTERPOLATION
  var x: Int = 25
  println(s"I am $x years old")
  println(s"This is Symbol --- $symbol")
  println(s"My age ${99/3 + 17}")
  println(raw"No\\\\escape!") // prints: No\\\\escape!
  println(f"${math.Pi}%.5f")
  val pi = "PI"
  println(f"$pi is approximately ${math.Pi}%.8f.")



  // OPERATORS ARE METHODS
  val sum = 1 + 2 // Scala invokes 1.+(2)
  val sumMore = 1.+(2)
  val longSum = 1 + 2L // Scala invokes 1.+(2L)

  val s = "Hello, world!"
     s indexOf 'o' // Scala invokes s.indexOf('o')
                  // res0: Int = 4

  s indexOf ('o', 5) // Scala invokes s.indexOf('o', 5) //second param is staring index
  // res1: Int = 8



  //ANY METHOD CAN BE AN OPERATOR
  -2.0 // Scala invokes (2.0).unary_-
  // res2: Double = -2.0
  2.0.unary_-
  // res3: Double = -2.0
  val s1 = "Hello, world!"
  // s: String = Hello, world!
  s1.toLowerCase
  // res4: String = hello, world!
  s1 toLowerCase
  // res5: String = hello, world!




  //OBJECT EQUALITY
   List(1, 2, 3) == List(1, 2, 3)
  //res34: Boolean = true
   List(1, 2, 3) == List(4, 5, 6)
  //res35: Boolean = false
  //Going further, you can compare two objects that have different types:
   1 == 1.0
  //res36: Boolean = true
   List(1, 2, 3) == "hello"
  //res37: Boolean = false
  //You can even compare against null, or against things that might be null. No exception will be thrown:
   List(1, 2, 3) == null
  //res38: Boolean = false
   null == List(1, 2, 3)
  //res39: Boolean = false
   ("he" + "llo") == "hello"
  //res40: Boolean = true
}