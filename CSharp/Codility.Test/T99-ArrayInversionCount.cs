using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using ArrayInversionCount;

namespace Codility.Test
{
    [TestClass]
    public class ArrayInversionCountTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { 1 };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }
        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = { 1, 2, 3, 4, 5, 6, 7 };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = { -1, 6, 3, 4, 7, 4 };
            int result = s.solution(A);
            Assert.AreEqual(4, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] A = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
            int result = s.solution(A);
            Assert.AreEqual(9, result);
        }
    }
}
