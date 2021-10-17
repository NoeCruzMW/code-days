def score(dice):
    s = 0
    m = {1: 0, 2: 0, 3: 0, 4: 0, 5: 0, 6: 0}
    for i in dice:
        if(i in m):
            c = m[i]
            m[i] = c + 1
    s = s + (int(m[1]/3)* 1000 )+ (int(m[1]%3) * 100)
    s = s + (int(m[2]/3)* 200 )
    s = s + (int(m[3]/3)* 300 )
    s = s + (int(m[4]/3)* 400 )
    s = s + (int(m[5]/3)* 500 )+ (int(m[5]%3) * 50)
    s = s + (int(m[6]/3)* 600 )
    return s


print(score([2, 3, 4, 6, 2]))
print(score([4, 4, 4, 3, 3]))
print(score([2, 4, 4, 5, 4]))