import unittest
import tp_toussaint


class TestTpToussaint(unittest.TestCase):
    
    def test_compareDate(self):
        self.assertEqual(0, tp_toussaint.compareDate(1,2,2026,1,2,2026))
        
        #self.assertRaises(AssertionError,tp_toussaint.compareDate,33,2,2026,1,2,2026)

            
if __name__ == "__main__":
    unittest.main()
