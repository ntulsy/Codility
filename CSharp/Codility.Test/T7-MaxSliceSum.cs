using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MaxSliceSum;

namespace Codility.Test
{
    [TestClass]
    public class MaxSliceSumTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] H = new int[] { 1 };
            int result = s.solution(H);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] H = new int[] { -1, -2, -3 };
            int result = s.solution(H);
            Assert.AreEqual(-1, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] H = new int[] { -1, -2, -3, 0 };
            int result = s.solution(H);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] H = new int[] { 5, 1 };
            int result = s.solution(H);
            Assert.AreEqual(6, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] H = new int[] { 3, 2, -6, 4, 0 };
            int result = s.solution(H);
            Assert.AreEqual(5, result);
        }
    }
}
