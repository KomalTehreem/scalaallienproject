package net.myprojecttrait
trait Allien
{
  //tell whether entered name is name of allien or not
  def allien(allienmessage:String):Int=
  {
    if(allienmessage!="none")
      println("\n\n"+allienmessage+" ia an Allian.");
    else
      println("\n\nYou didn't entered the correct name of an allien.\n\n");
    return 1;
  }
  def legs(legsmessage:Int):Int
  def colors(colormessage:String):Int
  def hair(hairmessage:Boolean):Int
  def weight(weightmessage:String):Int
  def height(heightmessage:String):Int
}