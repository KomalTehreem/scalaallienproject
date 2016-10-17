package net.myproject

import org.scalatest.FunSuite
//import net.myproject.ClassAlien

class ClassAlienTest extends FunSuite 
{
    test("the name is set correctly 1") 
    {  
        val p =new ClassAlien("turian")
        assert(p.name == "Turian")
    }
    test("the name is set correctly 2") 
    {      
        val p =new ClassAlien("Geth")
        assert(p.name == "Geth")
    }
    test("the name is set correctly 3") 
    {    
        val p =new ClassAlien("asari")
        assert(p.name == "Asari")
    }
    test("the name is set correctly 4") 
    {  
        val p =new ClassAlien("Krogan")
        assert(p.name == "Krogan")
    }
    test("the name is set correctly 5") 
    {
        val p =new ClassAlien("naaa")
        assert(p.name == "Naaa")
    }
    test("the name is set correctly 6") 
    {      
        val p =new ClassAlien("Salarian")
        assert(p.name == "Salarian")
    }
    test("the name is set correctly 7") 
    {      
        val p =new ClassAlien("Quarian")
        assert(p.name == "Quarian")
    }
    test("the name is set correctly 8") 
    {      
        val p =new ClassAlien("Inappropriate")
        assert(p.name == "Inappropriate")
    }
    test("the name is set correctly 9") 
    {      
        val p =new ClassAlien("Scalpe")
        assert(p.name == "Scalpe")
    }
    test("the allien trait 1")
    {
        val p =new ClassAlien("Inappropriate")
        assert(p.allien("Inappropriate") == 1)
    }
    test("the allien trait 2")
    {
        val p =new ClassAlien("Inappropriate")
        assert(p.legs(2) == 1)
    }
    test("the allien trait 3")
    {
        val p =new ClassAlien("Inappropriate")
        assert(p.colors("Inappropriate") == 1)
    }
    test("the allien trait 4(a)")
    {
        val p =new ClassAlien("Inappropriate")
        assert(p.hair(false) == 0)
    }
    test("the allien trait 4(b)")
    {
        val p =new ClassAlien("Inappropriate")
        assert(p.hair(true) == 1)
    }
    test("the allien trait 5")
    {
        val p =new ClassAlien("Inappropriate")
        assert(p.weight("Inappropriate") == 1)
    }
    test("the allien trait 6")
    {
        val p =new ClassAlien("Inappropriate")
        assert(p.height("Inappropriate") == 1)
    }
}
