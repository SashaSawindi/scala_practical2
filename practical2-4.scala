object q4{
  def attendees(price:Int):Int=120+((15-price)/5)*20

  def revenue(price: Int): Int = attendees(price) * price
  def cost(price:Int):Int=500+attendees(price)
  def profit(price:Int):Int =revenue(price)-cost(price)

  def main(args: Array[String]): Unit = {
    var price1 = 5
    var price2 = 25
    var price3 = 24
    var profit1 = profit(price1)
    println(f"Profit(ticket price=5): "+profit1)
    var profit2 = profit(price2)
    println(f"Profit(ticket price=25): "+profit2)
    var profit3 = profit(price3)
    println(f"Profit(ticket price=24): "+profit3)
  }

}