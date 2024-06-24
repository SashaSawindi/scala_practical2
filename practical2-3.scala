object q3{
  def normal(hours:Int):Int=hours*250
  def OT(hours:Int):Int=hours*85
  def income(h1:Int,h2:Int):Int=normal(h1)+OT(h2)
  def tax(income:Int)=income*0.12
  def takehome(h1:Int,h2:Int):Double=income(h1,h2)-tax(income(h1, h2))

  def main(args:Array[String]):Unit={
    var normal_hours=40
    var ot_hours=20
    var salary = takehome(normal_hours,ot_hours)

    println(f"Take home salary is : "+ salary)
  }
}