using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using Alpha2010;
using System.Linq;

namespace Codility.Challenge.Test
{
    [TestClass]
    public class Alpha2010Test
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { 2, 2, 1, 0, 1 };
            int result = s.solution(A);
            Assert.AreEqual(3, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { 2 };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = { 3, 3, 3, 3, 3, 3 };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = { 1, 2, 3, 4, 5, 6 };
            int result = s.solution(A);
            Assert.AreEqual(5, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] A = Enumerable.Repeat(1, (int) 1e6).ToArray();
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }
    }
}
