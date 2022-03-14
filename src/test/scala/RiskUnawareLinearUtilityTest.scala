package org.vermell.scrad

import org.specs2.mutable.Specification

class RiskUnawareLinearUtilityTest extends Specification {
  "calculate utilty function" should {
    RiskUnawareLinearUtility(13) must beEqualTo(13)
  }

  "apply for all members of list" should {
    val w = Vector[Float](2,4,16)

    val u = w.map(RiskUnawareLinearUtility.apply)
    u must beEqualTo(w)
  }
}
