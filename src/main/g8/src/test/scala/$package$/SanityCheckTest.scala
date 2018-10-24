package $package$

import com.typesafe.scalalogging.StrictLogging
import org.scalatest.{FlatSpec, MustMatchers}

class SanityCheckTest extends FlatSpec with MustMatchers with StrictLogging {
  it should "just compile and run sanity test" in {
    "identity" mustBe "identity"
  }
}
