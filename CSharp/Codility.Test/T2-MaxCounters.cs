using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MaxCounters;

namespace Codility.Test
{
    [TestClass]
    public class MaxCountersTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1 };
            int[] result = s.solution(1, A);
            int[] expectedResult = new int[] { 1 };
            CollectionAssert.AreEqual(expectedResult, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = new int[] { 2 };
            int[] result = s.solution(1, A);
            int[] expectedResult = new int[] { 0 };
            CollectionAssert.AreEqual(expectedResult, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 2, 3, 4, 5, 6 };
            int[] result = s.solution(6, A);
            int[] expectedResult = new int[] { 1, 1, 1, 1, 1, 1 };
            CollectionAssert.AreEqual(expectedResult, result);
        }


        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 1, 1, 1, 1, 2 };
            int[] result = s.solution(4, A);
            int[] expectedResult = new int[] { 5, 1, 0, 0 };
            CollectionAssert.AreEqual(expectedResult, result);
        }
    }
}
