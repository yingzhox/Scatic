package net.yingzxu.scatic.configuration


import _root_.com.fasterxml.jackson.annotation.JsonProperty
import java.util.{List => JList, Map => JMap}

/**
 * Created by Yingzhong on 3/16/2015.
 */


class ScaticConfigBean(@JsonProperty("siteName") _siteName: String
                       /*@JsonProperty("parameters") _parameters: JMap[String, String],
                       @JsonProperty("things") _things: JList[Thing]*/) {
  val siteName = null;

  //Preconditions.checkNotNull(_siteName, "name cannot be null")

  override def toString: String = {
    String.format("Configuration:siteName", siteName)
  }
}