from typing import List

PhoneNumber = str

def count_elements_rec(numbers: List[PhoneNumber], count: int = 0) -> int:
    dict_numbers = dict()

    for num in numbers: 
        if len(num) > 0 and num[0]  not in dict_numbers.keys():
            dict_numbers.update({num[0]: [num[1:]]})
            count += 1
        elif len(num) > 0 and num[0] in dict_numbers.keys():
            dict_numbers[num[0]].append(num[1:])

    for key, value in dict_numbers.items():
        if dict_numbers[key] != ['']:
            count += count_elements_rec(value) 
    return count


def count_elements_in_memory(numbers: List[PhoneNumber]) -> int: 
    numbers.sort()
    return count_elements_rec(numbers)