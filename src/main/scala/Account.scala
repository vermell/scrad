package org.vermell.scrad

object Account extends App {
  while (true) {
    Thread.sleep(1000)
    println(s"Hello World ${new java.util.Date}")
  }
  def calculateInterest: BigDecimal => BigDecimal = { interest =>
    interest * 2
  }
}
