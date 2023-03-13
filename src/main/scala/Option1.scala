class Optino1 {
  val v1: Option[Int] = Some(2)
  val v2: Option[Int] = Some(3)
  val v3: Option[Int] = Some(5)
  val v4: Option[Int] = Some(7)
  val v5: Option[Int] = Some(11)
  val result = v1.map { i1 =>
    v2.map { i2 =>
      v3.map { i3 =>
        v4.map { i4 =>
          v5.map(i5 => i1 * i2 * i3 * i4 * i5)
        }.flatten
      }.flatten
    }.flatten
  }.flatten
println(result)
}
