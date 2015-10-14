using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using MaxProductOfThree;

namespace Codility.Test
{
    [TestClass]
    public class MaxProductOfThreeTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = new int[] { -1, -2, -3, -4, -5 };
            int result = s.solution(A);
            Assert.AreEqual(-6, result);
        }


        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 1, 1 };
            int result = s.solution(A);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = new int[] { 4, 3, 1, 2, 0 , -2};
            int result = s.solution(A);
            Assert.AreEqual(24, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = new int[] { 10, 20, 30, -100, -10 };
            int result = s.solution(A);
            Assert.AreEqual(30000, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] A = new int[] { 2, 0, 22, -3 };
            int result = s.solution(A);
            Assert.AreEqual(0, result);
        }
    }
}
