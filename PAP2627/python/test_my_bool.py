import unittest
import my_bool


class TestMyBool(unittest.TestCase):
    def test_estPair(self):
        self.assertTrue(my_bool.estPair(0))
        
if __name__ == "__main__":
    unittest.main()