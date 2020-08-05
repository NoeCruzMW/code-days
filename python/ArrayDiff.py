"""
It should remove all values from list a, which are present in list b.
"""

def array_diff(a, b):    
    return [x for x in a if x not in b]

print(array_diff([1,2], [1])) #Expected [2]
print(array_diff([1,2,2], [1])) #Expected [2,2]
print(array_diff([1,2,2], [2]))  #Expected [1]
print(array_diff([1,2,2], []))  #Expected [1,2,2]
print(array_diff([], [1,2]))  #Expected []
