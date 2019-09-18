package primitives.math


case class Ratio[A: Integral](
  numerator: A,
  denominator: A
) extends Numeric[Ratio[A]]
{

  lazy val int: Integral[A] = implicitly[Integral[A]]

  lazy val ident = Ratio(
    int.times(
      numerator,
      int fromInt(int signum denominator)
    ),
    int.abs(denominator)
  )

  

}
