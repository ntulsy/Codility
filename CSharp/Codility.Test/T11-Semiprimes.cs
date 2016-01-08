using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Semiprimes;

namespace Codility.Test
{
    [TestClass]
    public class SemiprimesTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] P = new int[] { 1, 1, 1, 1, 1, 1, 1 };
            int[] Q = new int[] { 1, 1, 1, 1, 1, 1, 1 };
            int[] result = s.solution(10, P, Q);
            int[] expected = { 0, 0, 0, 0, 0, 0, 0 };
            CollectionAssert.AreEqual(expected, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] P = new int[] { 1, 4, 16 };
            int[] Q = new int[] { 26, 10, 20 };
            int[] result = s.solution(26, P, Q);
            int[] expected = { 10, 4, 0 };
            CollectionAssert.AreEqual(expected, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] P = new int[] { 1, 1, 1, 1, 1, 1, 1 };
            int[] Q = new int[] { 1, 1, 1, 1, 1, 1, 1 };
            int[] result = s.solution(50000, P, Q);
            int[] expected = { 0, 0, 0, 0, 0, 0, 0 };
            CollectionAssert.AreEqual(expected, result);
        }
    }
}
