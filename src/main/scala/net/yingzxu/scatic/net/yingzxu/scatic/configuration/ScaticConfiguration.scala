package net.yingzxu.scatic.net.yingzxu.scatic.configuration

/**
 * Created by Yingzhong on 3/12/2015.
 */
object ScaticConfiguration {
  def instance: ScaticConfiguration;

  def buildConfig(path: String) = {
    if (instance != NULL) instance;
    val content = io.Source.fromFile(path).mkString

  }

}
