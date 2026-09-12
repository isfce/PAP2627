import unittest
import my_math


class TestMyMath(unittest.TestCase):
    
    def test_estPair(self):
        self.assertTrue(my_math.estPair(0))
              
if __name__ == "__main__":
    unittest.main()
