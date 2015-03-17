package net.yingzxu.scatic.tests

import java.io.StringReader

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory
import net.yingzxu.scatic.configuration.ScaticConfigBean
import org.specs2.Specification
import net.yingzxu.scatic.configuration.
/**
 * Created by Yingzhong on 3/12/2015.
 */
class ConfigTest extends Specification {
  def is =
    s2"""
        verify configurations $config
      """;

  def config() = {
    val conf = "siteName: 1\nb: 2\nc:\n  - aaa\n  - bbb";
    //val reader = new FileReader("sample.yaml")
    val reader = new StringReader(conf);
    val mapper = new ObjectMapper(new YAMLFactory())
    val config: ScaticConfigBean = mapper.readValue(reader, classOf[ScaticConfigBean])
    val str = config.toString;
    println(config);
    str must startWith("Configuration");
  }
}
