package info.axurez.xml;

import scala._;
import scala.xml._;

object Parser {
  def main (args: Array[String]){
    val a = 32
    println(a)
    print(32323)
  }

  def parseXml(xmlInput: String): Unit = {

  }

  def compareXml(template: Elem, input: Elem): Boolean = {

    val inputAttributes = input \ "//@*"
    val templateAttributes = template \ "//@*"


    println(inputAttributes)
    return true;
  }
}