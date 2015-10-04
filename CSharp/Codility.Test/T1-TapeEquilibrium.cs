using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using TapeEquilibrium;

namespace Codility.Test
{
    [TestClass]
    public class TapeEquilibriumTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = new int[] {1, 1};
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }


        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 1, 1 };
            int result = s.solution(A);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 1, 1, 1 };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }


        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = new int[] { 3, 1, 2, 4, 3 };
            int result = s.solution(A);
            Assert.AreEqual(1, result);
        }
    }
}
