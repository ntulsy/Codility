using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using RectangleBuilderGreaterArea;

namespace Codility.Test
{
    [TestClass]
    public class RectangleBuilderGreaterAreaTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int X = 5;
            int[] A = { 1, 2, 5, 1, 1, 2, 3, 5, 1 };
            int result = s.solution(A, X);
            Assert.AreEqual(2, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int X = 1000;
            int[] A = { 1, 2, 5, 1, 1, 2, 3, 5, 1 };
            int result = s.solution(A, X);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int X = 1000;
            int[] A = { };
            int result = s.solution(A, X);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int X = 5;
            int[] A = { 1, 2, 5, 1, 1, 2, 3, 5, 1, 5, 5 };
            int result = s.solution(A, X);
            Assert.AreEqual(3, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int X = 5;
            int[] A = { 1, 2, 5, 1, 1, 2, 3, 5, 1, 5, 5, 1, 1, 1, 1, 1, 1, 5, 5, 5 };
            int result = s.solution(A, X);
            Assert.AreEqual(3, result);
        }
    }
}
