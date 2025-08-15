package org.fractalis.rockthejvm.scala3essentials.part1basics

object Expressions {

    // Expressions are structures that can be evaluated to a value
    val meaningOfLife = 40 + 2 // 40 + 2 is an expression

    // Mathematical expressions: +, -, *, /, bitwise |, &, <<, >>, >>>
    val mathExpression = 2 + 3 * 4

    // Comparison Expressions: <, <=, >, >=, ==, !=
    val equalityTest = 1 == 2

    // Boolean Expressions: !, ||, &&
    val nonEqualityTest = !equalityTest

    // Instructions vs Expressions

    // In Scala, think in terms of expressions.
    // Expressions are evaluated, instructions are executed

    // Ifs are expressions
    val aCondition = true

    // Code Blocks
    val aCodeBlock = {
        // Local values
        val localValue = 78

        // Expressions ...
        // Last Expression = value of the block
        localValue + 54
    }

    // Everything is an expression

    /**
     *  Exercise:
     *   Without running the code, what do you think these values will print out?
     */

    // 1
    val someValue = {
        2 < 3
    }

    // 2
    val someOtherVlaue = {
        if (someValue) 239 else 986
        42
    }

    // 3
    val yetAnotherValue = println("Scala")

    /* End Exercises */
    val anIfExpression = if (aCondition) 45 else 99

    def main(args: Array[String]): Unit = {
        println(anIfExpression)
    }
}
