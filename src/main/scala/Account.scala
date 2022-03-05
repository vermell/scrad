package org.vermell.scrad

object Account {
  def main(args: Array[String]) = {
    while (true) {
    Thread.sleep (1000)
    println (s"Hello World ${new java.util.Date}")
    }
  }

  def calculateInterest: BigDecimal => BigDecimal = { interest =>
    interest * 2
  }
}
