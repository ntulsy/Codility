using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NailingPlanks;

namespace Codility.Test
{
    [TestClass]
    public class NailingPlanksTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { 1, 4, 5, 8 };
            int[] B = { 4, 5, 9, 10 };
            int[] C = { 4, 6, 7, 10, 2 };
            int result = s.solution(A, B, C);
            Assert.AreEqual(4, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { 1 };
            int[] B = { 4 };
            int[] C = { 4, 6, 7, 10, 2 };
            int result = s.solution(A, B, C);
            Assert.AreEqual(1, result);
        }


        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = { 11 };
            int[] B = { 14 };
            int[] C = { 4, 6, 7, 10, 2 };
            int result = s.solution(A, B, C);
            Assert.AreEqual(-1, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = { 1, 4, 5, 8 ,30 };
            int[] B = { 4, 5, 9, 10, 32 };
            int[] C = { 4, 6, 7, 10, 2 };
            int result = s.solution(A, B, C);
            Assert.AreEqual(-1, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] A = { 1 };
            int[] B = { 1 };
            int[] C = { 1 };
            int result = s.solution(A, B, C);
            Assert.AreEqual(1, result);
        }
    }
}
