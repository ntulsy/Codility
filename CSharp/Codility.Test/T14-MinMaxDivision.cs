using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MinMaxDivision;

namespace Codility.Test
{
    [TestClass]
    public class MinMaxDivisionTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { 2, 1, 5, 1, 2, 2, 2 };
            int result = s.solution(3, 5, A);
            Assert.AreEqual(6, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { 0, 0, 0, 0, 0, 0, 0, 0 };
            int result = s.solution(3, 5, A);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = { 5, 5, 5, 5, 5, 5, 5 };
            int result = s.solution(3, 5, A);
            Assert.AreEqual(15, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = { 5, 5, 5, 5, 5, 5, 5 };
            int result = s.solution(1, 10, A);
            Assert.AreEqual(35, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] A = { 5 };
            int result = s.solution(100, 10, A);
            Assert.AreEqual(5, result);
        }

        [TestMethod]
        public void TestMethod6()
        {
            Solution s = new Solution();
            int[] A = { 1, 1, 1, 1, 1, 1, 1, 1 };
            int result = s.solution(100, 10, A);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod7()
        {
            Solution s = new Solution();
            int[] A = { 1, 1, 1, 1, 1, 1, 1, 0 };
            int result = s.solution(3, 10, A);
            Assert.AreEqual(3, result);
        }
    }
}
