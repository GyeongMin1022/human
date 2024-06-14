country = ['Korea','Spain',"Germany","Canada","france","Serbia"]
print(max(country))
print(max(country, key=lambda x:x[2]))
print(max(country, key=lambda i:i.lower()))