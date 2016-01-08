using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MinAvgTwoSlice;

namespace Codility.Test
{
    [TestClass]
    public class MinAvgTwoSliceTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = new int[] { 0, 0, 0, 0, 0, 0, 0, 0 };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }


        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 1 };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 1, 1, 1, 1, 1, 1, 1, 0 };
            int result = s.solution(A);
            Assert.AreEqual(7, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = new int[] { 0, 1, 1, 1, 1, 1, 1, 1, 0 };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] A = new int[] { 0, 1, 0, 1, 1 };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod6()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1000, 1000, 1, 10, 1 };
            int result = s.solution(A);
            Assert.AreEqual(2, result);
        }
    }
}
