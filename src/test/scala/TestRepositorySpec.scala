import org.scalatest.concurrent.ScalaFutures
import org.scalatest.FlatSpec
import play.api.libs.json.{JsValue, Json}
import reactivemongo.play.json.BSONFormats


class TestRepositorySpec extends FlatSpec
  with ScalaFutures {

  "insert RAW Filing" should "save to mongo" in {
      val filePath: String = getClass.getResource(s"feb2015NoPeriodOfAccounts.json").getFile
      val jsonString = scala.io.Source.fromFile(filePath).mkString
      val value: JsValue = (Json.parse(jsonString))
      val suspect = BSONFormats.BSONDocumentFormat.reads(value).getOrElse(throw new IllegalArgumentException("could not parse the JSON"))
      assert(suspect.toString() != "BSONDocument(<non-empty>)")
    }

}


