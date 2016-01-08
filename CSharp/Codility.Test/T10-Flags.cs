using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Flags;

namespace Codility.Test
{
    [TestClass]
    public class FlagsTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 1, 1, 1, 1, 1, 1 };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 1, 1, 2, 1, 1, 1 };
            int result = s.solution(A);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 1, 1, 2, 1, 2, 1 };
            int result = s.solution(A);
            Assert.AreEqual(2, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 2, 1, 1, 2, 1, 1, 2 };
            int result = s.solution(A);
            Assert.AreEqual(2, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] A = new int[] { 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2};
            int result = s.solution(A);
            Assert.AreEqual(2, result);
        }

        [TestMethod]
        public void TestMethod6()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1 };
            int result = s.solution(A);
            Assert.AreEqual(4, result);
        }

        [TestMethod]
        public void TestMethod7()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 5, 3, 4, 3, 4, 1, 2, 3, 4, 6, 2 };
            int result = s.solution(A);
            Assert.AreEqual(3, result);
        }
    }
}
