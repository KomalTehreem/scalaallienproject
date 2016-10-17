package net.myproject

import net.myprojecttrait._

class ClassAlien(namez:String) extends Allien
{
  var name:String=namez.capitalize
  // print no of legs
  override def legs(legsmessage:Int):Int=
  {
    if(legsmessage >1)
      println("It has "+legsmessage+" legs")
    else
      println("It has "+legsmessage+" leg.")
    return 1;
  }  
  //print the color
  override def colors(colormessage:String):Int=
  {
    println("Its color is "+colormessage+".");
    return 1;
  }
  //tell whether allien have hair or not
  override def hair(hairmessage:Boolean):Int=
  {
    if(hairmessage)
    {
      println("It has hair on its body.")
      return 1;
    }
    else
    {
      println("It has no hair on its body.")
      return 0;
    }
  }
  //print weight of an allien
  override def weight(weightmessage:String):Int=
  {
    println("Its weight is "+weightmessage+" .")
    return 1;
  }
  //print height
  override def height(heightmessage:String):Int=
  {
    println("Its height is "+heightmessage+" .\n\n")
    return 1;
  }
  //check the name of allien and then pass different characteristics to traits functions to print them
  def printer()
  {
    if(name=="Turian")
    {
        allien("Turian")
        legs(1)
        colors("Black")
        hair(false)
        weight("1 kg")
        height("1 ft")
    }
    else if(name=="Asari")
    {
        allien("Asari")
        legs(2)
        colors("Green")
        hair(false)
        weight("2 kg")
        height("2 ft")
    }
    else if(name=="Salarian")
    {
        allien("Salarian")
        legs(8)
        colors("Black and White")
        hair(true)
        weight("12 kg")
        height("3 ft")
    }
    else if(name=="Krogan")
    {
        allien("Krogan")
        legs(6)
        colors("Green")
        hair(true)
        weight("0.5 kg")
        height("5 cm") 
    }
    else if(name=="Quarian")
    {
        allien("Quarian")
        legs(4)
        colors("Black")
        hair(true)
        weight("10 kg")
        height("1 ft")
    }
    else if(name=="Geth")
    {
        allien("Geth")
        legs(4)
        colors("Grey")
        hair(true)
        weight("80 kg")
        height("5 ft")
    }
    else if(name=="Inappropriate")
    {
        allien("Inappropriate")
        legs(2)
        colors("Yellow")
        hair(false)
        weight("100 kg")
        height("6 ft")
    }
    else if(name=="Scalpe")
    {
      allien("Scalpe")
        legs(4)
        colors("Yellow")
        hair(false)
        weight("110 kg")
        height("5 ft")
    }
    else
    {
      allien("none")
    }
  }
}
object MyProject
{
  def main(args:Array[String])
  {
    println("Enter the name of an Allien.")
    var inputvalue=Console.readLine
    val typeobject=new ClassAlien(inputvalue)
    typeobject.printer()
  }
}