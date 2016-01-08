using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using CountNonDivisible;

namespace Codility.Test
{
    [TestClass]
    public class CountNonDivisibleTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = new int[] { 3, 1, 2, 3, 6 };
            int[] result = s.solution(A);
            int[] expected = { 2, 4, 3, 2, 0 };
            CollectionAssert.AreEqual(expected, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 1, 1, 1, 1, 1, 1 };
            int[] result = s.solution(A);
            int[] expected = { 0, 0, 0, 0, 0, 0, 0 };
            CollectionAssert.AreEqual(expected, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = new int[] { 100, 10 };
            int[] result = s.solution(A);
            int[] expected = { 0, 1 };
            CollectionAssert.AreEqual(expected, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = new int[] { 3, 6, 10 };
            int[] result = s.solution(A);
            int[] expected = { 2, 1, 2 };
            CollectionAssert.AreEqual(expected, result);
        }

    }
}
