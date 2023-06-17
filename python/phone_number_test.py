import unittest
from phone_number import count_elements_in_memory

class PhoneNumberTest(unittest.TestCase):

    def test_case_one_simple_number(self):
        numbers = ["0467123456"]
        self.assertEqual(count_elements_in_memory(numbers), 10)

    def test_case_without_common_base(self):
        numbers = ["0123456789", "1123456789"]
        self.assertEqual(count_elements_in_memory(numbers), 20)

    def test_case_inclusion(self):
        numbers = ["0123456789", "0123"]
        self.assertEqual(count_elements_in_memory(numbers), 10)

    def test_case_with_common_base(self):
        numbers = ["0412578440", "0412199803", "0468892011", "112", "15"]
        self.assertEqual(count_elements_in_memory(numbers), 28)

    def test_case_a_big_list(self):
        numbers = [
            "10000",
            "2980950684",
            "5047459100",
            "3811658223",
            "6951565505",
            "0200306553",
            "4924502386",
            "59278",
            "633",
            "776524",
            "9967765390",
            "8044781997",
            "1892478193",
            "28214",
            "3855270610",
            "1130326923",
            "9809183034",
            "820100",
            "8885"
        ]
        self.assertEqual(count_elements_in_memory(numbers), 144)
