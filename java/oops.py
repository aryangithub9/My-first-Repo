class Item:
  pay_rate = 0.88
  def __init__(self,name:str,price:float,quantity:int):

    assert price > 0 ,f"price{price} is always more than 0"
    assert quantity >0, f"quantity{quantity} is always more than 0"
    self.name = name
    self.price = price
    self.quantity = quantity
  
  def calculate_total_price(self):
    return self.price * self.quantity
  

  def apply_discount(self):
    self.price = self.price *self.pay_rate
  
item1 = Item("phone",10000,8)
item2 = Item("laptop",39999,2)
item3 = Item("tv",50000,3)
item4 = Item("cable",4000,80)
item5 = Item("mouse",200,20)
item6 =Item("keyboard",200,1000)

item6.apply_discount()
print(item6.calculate_total_price())
print(item6.price)

item2.pay_rate = 0.5
item2.apply_discount()
print(item2.calculate_total_price())