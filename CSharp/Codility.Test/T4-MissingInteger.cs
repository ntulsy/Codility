using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MissingInteger;

namespace Codility.Test
{
    [TestClass]
    public class MissingIntegerTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 3, 6, 4, 1, 2 };
            int result = s.solution(A);
            Assert.AreEqual(5, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = new int[] { 10000 };
            int result = s.solution(A);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = new int[] { 2, 3, 4, 5, 6, 7, 1 };
            int result = s.solution(A);
            Assert.AreEqual(8, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = new int[] { 4, 1, 3, 2 };
            int result = s.solution(A);
            Assert.AreEqual(5, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 2, 2 };
            int result = s.solution(A);
            Assert.AreEqual(3, result);
        }

        [TestMethod]
        public void TestMethod6()
        {
            Solution s = new Solution();
            int[] A = new int[] { -1, -2, -3 };
            int result = s.solution(A);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod7()
        {
            Solution s = new Solution();
            int[] A = new int[] { 0, -2, -3 };
            int result = s.solution(A);
            Assert.AreEqual(1, result);
        }
    }
}
