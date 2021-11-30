package com.mobifone.myutils

class MyMath {
    companion object {
        fun plus(a: Int, b: Int): Int {
            return a + b
        }

        fun minus(a: Int, b: Int): Int {
            return a - b
        }

        fun times(a: Int, b: Int): Int {
            return a* b
        }

        fun div(a: Int, b: Int): Float {
            if (b == 0)  throw IllegalArgumentException("Div by Zero error")
            else return (a/b).toFloat()
        }
    }
}