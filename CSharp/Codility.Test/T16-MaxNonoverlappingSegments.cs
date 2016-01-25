using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MaxNonoverlappingSegments;

namespace Codility.Test
{
    [TestClass]
    public class MaxNonoverlappingSegmentsTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { 1, 3, 7, 9, 9 };
            int[] B = { 5, 6, 8, 9, 10 };
            int result = s.solution(A, B);
            Assert.AreEqual(3, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { };
            int[] B = { };
            int result = s.solution(A, B);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = { 1 };
            int[] B = { 1 };
            int result = s.solution(A, B);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = { 1, 1, 1, 1, 1 };
            int[] B = { 1, 2, 3, 4, 5 };
            int result = s.solution(A, B);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] A = { 1, 2, 3, 1, 1 };
            int[] B = { 1, 2, 3, 4, 5 };
            int result = s.solution(A, B);
            Assert.AreEqual(3, result);
        }
    }
}
