import unittest
import tp00

class TestTp00(unittest.TestCase):
    
    def test_calculDecision(self):
        self.assertEqual("Refus",tp00.calculDecision(0))
            
if __name__ == "__main__":
    unittest.main()