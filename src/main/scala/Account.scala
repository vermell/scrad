package org.vermell.scrad

object Account {
  def calculateInterest: BigDecimal => BigDecimal = { interest =>
    interest * 2
  }
}
