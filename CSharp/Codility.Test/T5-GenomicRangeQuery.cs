using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using GenomicRangeQuery;

namespace Codility.Test
{
    [TestClass]
    public class GenomicRangeQueryTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            String S = "CAGCCTA";
            int[] P = new int[] { 2, 5, 0 };
            int[] Q = new int[] { 4, 5, 6 };
            int[] result = s.solution(S, P, Q);
            int[] expected = { 2, 4, 1 };
            CollectionAssert.AreEqual(expected, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            String S = "AAAAAAA";
            int[] P = new int[] { 1, 5, 0 };
            int[] Q = new int[] { 4, 5, 6 };
            int[] result = s.solution(S, P, Q);
            int[] expected = { 1, 1, 1 };
            CollectionAssert.AreEqual(expected, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            String S = "TTTATTT";
            int[] P = new int[] { 2, 5, 0 };
            int[] Q = new int[] { 4, 5, 6 };
            int[] result = s.solution(S, P, Q);
            int[] expected = { 1, 4, 1 };
            CollectionAssert.AreEqual(expected, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            String S = "CAGCCTA";
            int[] P = new int[] { 0, 5, 6 };
            int[] Q = new int[] { 0, 5, 6 };
            int[] result = s.solution(S, P, Q);
            int[] expected = { 2, 4, 1 };
            CollectionAssert.AreEqual(expected, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            String S = "TC";
            int[] P = new int[] { 0, 0, 1 };
            int[] Q = new int[] { 0, 1, 1 };
            int[] result = s.solution(S, P, Q);
            int[] expected = { 4, 2, 2 };
            CollectionAssert.AreEqual(expected, result);
        }
    }
}
