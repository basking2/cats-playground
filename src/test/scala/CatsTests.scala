import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should
import cats.implicits._
import cats.kernel.Semigroup

class CatsTests extends AnyFlatSpec with should.Matchers {
  "cats" should "make sense" in {

    Semigroup.combine(1,2) should be (3)

    Semigroup[List[Int]].combine(List(1, 2, 3), List(4, 5, 6)) should be( List(1,2,3,4,5,6) )
    Semigroup[Option[Int]].combine(Option(1), Option(2)) should be( Option(3) )

    Semigroup[Option[Int]].combine(Option(1), None) should be( Some(1) )



  }

}