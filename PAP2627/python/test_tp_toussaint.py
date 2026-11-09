import unittest
import tp_toussaint

class TestTpToussaint(unittest.TestCase):
    
    def test_compareDate(self):
        self.assertEqual(0, tp_toussaint.compareDate(1, 2, 2026, 1, 2, 2026))
        self.assertEqual(1, tp_toussaint.compareDate(2, 2, 2026, 1, 2, 2026))
        self.assertEqual(1, tp_toussaint.compareDate(1, 3, 2026, 1, 2, 2026))
        self.assertEqual(1, tp_toussaint.compareDate(1, 2, 2028, 1, 2, 2026))
        self.assertEqual(-1, tp_toussaint.compareDate(1, 2, 2026, 2, 2, 2026))
        self.assertEqual(-1, tp_toussaint.compareDate(1, 2, 2026, 1, 3, 2026))
        self.assertEqual(-1, tp_toussaint.compareDate(1, 2, 2026, 1, 2, 2028))
        self.assertRaises(AssertionError,tp_toussaint.compareDate,33,2,2026,1,2,2026)
        self.assertRaises(AssertionError,tp_toussaint.compareDate,3,22,2026,1,2,2026)
        self.assertRaises(AssertionError,tp_toussaint.compareDate,3,2,2026,44,2,2026)
        self.assertRaises(AssertionError,tp_toussaint.compareDate,3,2,2026,1,22,2026)   

    def test_compareDate2(self):
        self.assertEqual(0, tp_toussaint.compareDate2(1, 2, 2026, 1, 2, 2026))
        self.assertEqual(1, tp_toussaint.compareDate2(2, 2, 2026, 1, 2, 2026))
        self.assertEqual(1, tp_toussaint.compareDate2(1, 3, 2026, 1, 2, 2026))
        self.assertEqual(1, tp_toussaint.compareDate2(1, 2, 2028, 1, 2, 2026))
        self.assertEqual(-1, tp_toussaint.compareDate2(1, 2, 2026, 2, 2, 2026))
        self.assertEqual(-1, tp_toussaint.compareDate2(1, 2, 2026, 1, 3, 2026))
        self.assertEqual(-1, tp_toussaint.compareDate2(1, 2, 2026, 1, 2, 2028))
        self.assertRaises(AssertionError,tp_toussaint.compareDate2,33,2,2026,1,2,2026)
        self.assertRaises(AssertionError,tp_toussaint.compareDate2,3,22,2026,1,2,2026)
        self.assertRaises(AssertionError,tp_toussaint.compareDate2,3,2,2026,44,2,2026)
        self.assertRaises(AssertionError,tp_toussaint.compareDate2,3,2,2026,1,22,2026)   

    def test_compareDate3(self):
        self.assertEqual(0, tp_toussaint.compareDate3(1, 2, 2026, 1, 2, 2026))
        self.assertEqual(1, tp_toussaint.compareDate3(2, 2, 2026, 1, 2, 2026))
        self.assertEqual(1, tp_toussaint.compareDate3(1, 3, 2026, 1, 2, 2026))
        self.assertEqual(1, tp_toussaint.compareDate3(1, 2, 2028, 1, 2, 2026))
        self.assertEqual(-1, tp_toussaint.compareDate3(1, 2, 2026, 2, 2, 2026))
        self.assertEqual(-1, tp_toussaint.compareDate3(1, 2, 2026, 1, 3, 2026))
        self.assertEqual(-1, tp_toussaint.compareDate3(1, 2, 2026, 1, 2, 2028))
        self.assertRaises(AssertionError,tp_toussaint.compareDate3,33,2,2026,1,2,2026)
        self.assertRaises(AssertionError,tp_toussaint.compareDate3,3,22,2026,1,2,2026)
        self.assertRaises(AssertionError,tp_toussaint.compareDate3,3,2,2026,44,2,2026)
        self.assertRaises(AssertionError,tp_toussaint.compareDate3,3,2,2026,1,22,2026)   

if __name__ == "__main__":
    unittest.main()
