package net.yingzxu.scatic.tests

import org.fusesource.scalate._
import org.specs2._
import org.specs2.specification
import scala.io.Source;

/**
 * Created by Yingzhong on 3/10/2015.
 */
class TemplateTest extends Specification {
  def is =
    s2"""
      This is a test for basic template test
      Test case $parseTemplate
    """;

  //  def main(args:Array[String]) = {
  //    println("hello");
  //
  //
  //
  //  }
  def parseTemplate = {
    // val source = Source.fromURL(getClass.getResource("/template.ssp"));
    val template = TemplateSource.fromURL(getClass.getResource("/template1.ssp"));
    val engine = new TemplateEngine;
    val output = engine.layout(template);
    println(output);
    output must startWith("Hello");
  }
}
