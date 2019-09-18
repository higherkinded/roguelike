package math


package object ops {

  implicit class IntegralOps[A <: Integral[A]](a: A)(
    implicit _int: Integral[A]
  ) {

    def %(b: A) = _int.rem(a, b)
    def +(b: A) = _int.plus(a, b)
    def -(b: A) = _int.minus(a, b)
    def *(b: A) = _int.times(a, b)
    def >/>(b: A) = a gcd b

  }

  implicit class Multiples[A <: Integral[A]](v: A) {

    def gcd(a: A, b: B) = if (a == 0) b else gcd(b % a, a)

    // def lcm(u: A) = v % u

  }

}
