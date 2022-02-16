package org.vermell.scrad

import org.specs2.mutable.Specification
import org.vermell.scrad.Account
class AccountTest extends Specification {
  "calculateInterest" should {
    Account.calculateInterest(1) === 2
  }
}
