package net.yingzxu.scatic.tests

import org.specs2.Specification
import org.yaml.snakeyaml._
/**
 * Created by Yingzhong on 3/12/2015.
 */
class ConfigTest extends Specification {
  def is =
    s2"""
        verify configurations $config
      """;

  def config() = {
    val yaml = new Yaml();
    val obj = yaml.load("a: 1\nb: 2\nc:\n  - aaa\n  - bbb");
    println(obj);
    val str = obj.toString;
    str must startWith("{");
  }
}
