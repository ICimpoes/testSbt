import org.scalatest._

class MultTest extends WordSpec with Matchers {

	"test" should {

		"aaaa" in {
			Mult.pow2(10) shouldBe 100
}	

		"aaaa2" in {
			Mult.pow2(10) shouldBe 110
}	
}

}