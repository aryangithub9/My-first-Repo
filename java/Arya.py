#object oriented programming in python
# we are surrounded by object and we are also an object 
# to represent object of our real life in programming is called oops
#In oops we work with real entities

#In oops their are two things one is class and one is object
# class- class is a template/blue print for real entities
#object cointains attributes and methods
#Attributes is the properties of an object
# methods is the behaviour of an object


class Employee:
  def __init__(self,name:str,gender:str,age:int,salary:int):

    assert gender == 'Male' or 'Female'
    assert age >= 18
    assert salary > 30000

    self.name = name
    self.gender = gender
    self.age = age
    self.salary = salary


  def show_employee_details(self):
      print("Name of the employee is" , self.name)
      print("Gender of the employee is" , self.gender)
      print("Age of the employee is" , self.age)
      print("Salary of the employee is" , self.salary)


E1 = Employee("Ram","Male",19,200000)
#print(E1.show_employee_details())

#Inheritance - when one class derive the properties of another class

class Vechile:
   def __init__(self,cost,color,mielage):
      self.cost = cost
      self.color = color 
      self.mielage = mielage


   def show_details_of_vechile(self):
      print("I am a vechile")
      print("Cost of vechile",self.cost)
      print("color of vehile is",self.color) 
      print("mielage of the vechile is",self.mielage)

#v1 = Vechile(200000,"blue",20)
#print(v1.show_details_of_vechile())


class Car(Vechile):
   def show_car_details(self):
      print('Hi.. I am the car')

c1 = Car(200000,"black",14)
print(c1.show_details_of_vechile())