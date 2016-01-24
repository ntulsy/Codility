using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MinAbsSumOfTwo;

namespace Codility.Test
{
    [TestClass]
    public class MinAbsSumOfTwoTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { 1, 4, -3 };
            int result = s.solution(A);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { -8, 4, 5, -10, 3 };
            int result = s.solution(A);
            Assert.AreEqual(3, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = { 1, 2 };
            int result = s.solution(A);
            Assert.AreEqual(2, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = { 10 };
            int result = s.solution(A);
            Assert.AreEqual(20, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] A = { 7, 8, 9, 5, -2, -4, -5  };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod6()
        {
            Solution s = new Solution();
            int[] A = { 0, 1, 2, 3, 4, 5, 6};
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }
    }
}
