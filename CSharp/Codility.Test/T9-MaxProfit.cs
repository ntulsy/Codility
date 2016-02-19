using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MaxProfit;

namespace Codility.Test
{
    [TestClass]
    public class MaxProfitTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] H = new int[] { };
            int result = s.solution(H);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] H = new int[] { 1 };
            int result = s.solution(H);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] H = new int[] { 1, 5 };
            int result = s.solution(H);
            Assert.AreEqual(4, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] H = new int[] { 5, 1 };
            int result = s.solution(H);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] H = new int[] { 23171, 21011, 21123, 21366, 21013, 21367 };
            int result = s.solution(H);
            Assert.AreEqual(356, result);
        }
    }
}
