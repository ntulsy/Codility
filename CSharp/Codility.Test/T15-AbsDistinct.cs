using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using AbsDistinct;

namespace Codility.Test
{
    [TestClass]
    public class AbsDistinctTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { -5, -3, -1, 0, 3, 6 };
            int result = s.solution(A);
            Assert.AreEqual(5, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { Int32.MaxValue, Int32.MinValue, Int32.MinValue + 1 };
            int result = s.solution(A);
            Assert.AreEqual(2, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = { 1, -1 };
            int result = s.solution(A);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = { 1, -1, 0 };
            int result = s.solution(A);
            Assert.AreEqual(2, result);
        }

    }
}
