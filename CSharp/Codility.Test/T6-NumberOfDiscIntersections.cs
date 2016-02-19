using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NumberOfDiscIntersections;

namespace Codility.Test
{
    [TestClass]
    public class NumberOfDiscIntersectionsTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = new int[] { 0, 0, 2 };
            int result = s.solution(A);
            Assert.AreEqual(2, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 1, 1 };
            int result = s.solution(A);
            Assert.AreEqual(3, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = new int[] { 0, 0, 0, 2147483647 };
            int result = s.solution(A);
            Assert.AreEqual(3, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 5, 2, 1, 4, 0 };
            int result = s.solution(A);
            Assert.AreEqual(11, result);
        }
    }
}
