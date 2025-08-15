package org.fractalis.rockthejvm.scala3essentials.part1basics

object ValuesAndTypes {

  // Values
  val meaningOfLife: Int = 42 // const int meaningOfLife = 42

  // Reassigning is not allowed, due to val
  // meaningOfLife = 45

  // Type Inferrence
  val anInteger = 67 // : Int is optional

  // Common Types
  val aBoolean: Boolean = false;
  val aChar: Char = 'a';
  val anInt: Int = 78 // 4 Bytes
  val aShort: Short = 128 // 2 Bytes
  val aLong: Long = 52789572389234L // 8 Bytes
  val aFloat: Float = 3.2f // 4 Bytes
  val aDouble: Double = 3.14 // 8 Bytes

  // String
  val aString: String = "Scala Vibes";


  def main(args: Array[String]): Unit = {}
}
