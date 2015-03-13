package net.yingzxu.scatic.tests

import org.specs2.Specification

/**
 * Created by Yingzhong on 3/12/2015.
 */
class ConfigTest extends Specification {
  def is =
    s2"""
        verify configurations $config
      """.stripMargin;

  def config() = {

  }
}
