income = float(input("Enter your income"))
tax = 0
if income <= 300000:
  tax = 0
elif 300001 <= income <= 600000:
  tax = 0.05*(income-300000)
elif 600001 <= income <= 900000:
  tax = 15000 + 0.1*(income -600000)
elif 900001<= income <= 1200000:
  tax = 45000 + 0.15*(income - 900000)
elif 1200001 <= income <= 1500000:
  tax = 45000 + 0.2*(income - 120000)
else:
  tax = 150000 + 0.3 *(income - 1500000)

print("so your income tax is ", tax)

