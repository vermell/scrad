package org.vermell.scrad

trait Utility {
  def apply(x: Float): Float
}

object RiskUnawareLinearUtility extends Utility {
  override def apply(x: Float): Float = {x}
}
