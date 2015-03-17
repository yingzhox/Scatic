package net.yingzxu.scatic.configuration

/**
 * Created by Yingzhong on 3/12/2015.
 */
object ScaticConfiguration {
  val instance: ScaticConfigBean = null;

  def buildConfig(path: String) = {
    if (instance != null) instance;
    val content = io.Source.fromFile(path).mkString

  }

}
