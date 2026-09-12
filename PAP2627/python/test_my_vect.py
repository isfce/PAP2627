import unittest
import my_vect


class TestMyVect(unittest.TestCase):
       
    def somme(self):
        self.assertEqual(3,my_vect.somme([1,2]));
                
if __name__ == "__main__":
    unittest.main()