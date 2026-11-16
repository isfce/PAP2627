import unittest
import my_math


class TestMyMath(unittest.TestCase):
    
    def test_estPair(self):
        self.assertTrue(my_math.estPair(0))
        
    def test_fact(self):
        self.assertEqual(1, my_math.fact(0))
        self.assertEqual(1, my_math.fact(1))
        self.assertEqual(120, my_math.fact(5))
        self.assertRaises(AssertionError, my_math.fact, -1)
     
    def test_calculSomme(self):
        self.assertEqual(0, my_math.calculSomme(-10, 10))
        self.assertEqual(6 + 7, my_math.calculSomme(-5, 7)) 
        self.assertEqual(-6 - 7, my_math.calculSomme(-7, 5))
        self.assertEqual(2 + 3 + 4, my_math.calculSomme(2, 4)) 
        self.assertEqual(-(2 + 3 + 4), my_math.calculSomme(-4, -2))
        self.assertRaises(AssertionError, my_math.calculSomme, 10, 5)
    
    def test_fibo(self):
        self.assertEqual(0, my_math.fibo(0))
        self.assertEqual(1, my_math.fibo(1))
        self.assertEqual(8, my_math.fibo(6))
        self.assertRaises(AssertionError, my_math.fibo, -1)     

              
if __name__ == "__main__":
    unittest.main()
