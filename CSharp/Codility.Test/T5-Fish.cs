using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Fish;

namespace Codility.Test
{
    [TestClass]
    public class FishTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { 10 };
            int[] B = { 0 };
            int result = s.solution(A, B);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { 10 };
            int[] B = { 1 };
            int result = s.solution(A, B);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = { 10, 11, 2, 3, 4, 5 };
            int[] B = { 1, 1, 1, 1, 1, 1 };
            int result = s.solution(A, B);
            Assert.AreEqual(6, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = { 10, 11, 2, 3, 4, 5 };
            int[] B = { 0, 0, 0, 0, 0, 0 };
            int result = s.solution(A, B);
            Assert.AreEqual(6, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] A = { 10, 11, 2, 3, 4, 5 };
            int[] B = { 0, 0, 1, 1, 0, 0 };
            int result = s.solution(A, B);
            Assert.AreEqual(4, result);
        }

        [TestMethod]
        public void TestMethod6()
        {
            Solution s = new Solution();
            int[] A = { 10, 11, 2, 3, 4, 5 };
            int[] B = { 1, 0, 1, 1, 0, 0 };
            int result = s.solution(A, B);
            Assert.AreEqual(3, result);
        }

        [TestMethod]
        public void TestMethod7()
        {
            Solution s = new Solution();
            int[] A = { 4, 3, 2, 1, 5 };
            int[] B = { 0, 1, 0, 0, 0 };
            int result = s.solution(A, B);
            Assert.AreEqual(2, result);
        }
    }
}
