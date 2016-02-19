using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MaxDoubleSliceSum;

namespace Codility.Test
{
    [TestClass]
    public class MaxDoubleSliceSum
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] H = new int[] { 3, 2, 6, -1, 4, 5, -1, 2 };
            int result = s.solution(H);
            Assert.AreEqual(17, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] H = new int[] { 5, 1, 2 };
            int result = s.solution(H);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] H = new int[] { -1, -1, -1 };
            int result = s.solution(H);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] H = new int[] { -1, -1, -2, -3 };
            int result = s.solution(H);
            Assert.AreEqual(0, result);
        }
    }
}
