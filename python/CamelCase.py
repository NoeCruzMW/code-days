# Transform snake case to camel case
def to_camel_case(text):
  words = str(text.replace("-","_")).split("_")
  for i in range(len(words)):
    if i>0:
      words[i] = str(words[i][0]).upper()+words[i][1:]
  return "".join(words)
    
print(to_camel_case("the-stealth-warrior"))
print(to_camel_case("the_stealth_warrior"))