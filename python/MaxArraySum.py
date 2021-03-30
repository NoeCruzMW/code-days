def sub_array(array, i):
    return array


def max_sequence(arr):
    max_sum = 0
    curr_sum = 0
    for x in arr:
        if x > 0 or (curr_sum + x  > 0):
            if (curr_sum + x) > curr_sum:
                curr_sum = curr_sum + x            
        else:
            max_sum = curr_sum if curr_sum > max_sum else max_sum
            curr_sum = 0
    return max_sum if max_sum > curr_sum else curr_sum

if __name__ == "__main__":
    print(max_sequence([-2, 1, -3, 4, -1, 2, 1, -5, 4]))
