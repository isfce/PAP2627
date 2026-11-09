import unittest
import my_math


class TestMyMath(unittest.TestCase):
    
    def test_estPair(self):
        self.assertTrue(my_math.estPair(0))
        
    def test_fact(self):
        self.assertEqual(1,my_math.fact(0))
        self.assertEqual(1,my_math.fact(1))
        self.assertEqual(120,my_math.fact(5))
        self.assertRaises(AssertionError, my_math.fact,-1)
        
              
if __name__ == "__main__":
    unittest.main()
