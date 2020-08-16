package idea.test

import com.typesafe.config.Config
import pureconfig.ConfigSource
import pureconfig.generic.auto._

class TestConfig  {

  val config: Config = ???

  ConfigSource
    .fromConfig(config)
    .at("saa")
    .load[SampleConfiguration]

}


case class SampleConfiguration(
  test: String
)
