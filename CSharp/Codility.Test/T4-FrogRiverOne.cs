using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using FrogRiverOne;

namespace Codility.Test
{
    [TestClass]
    public class FrogRiverOneTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 3, 1, 4, 2, 3, 5, 4 };
            int result = s.solution(5, A);
            Assert.AreEqual(6, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = new int[] { 1, 3, 1, 4, 2, 3, 5, 4 };
            int result = s.solution(1, A);
            Assert.AreEqual(0, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = new int[] { 2, 3, 4, 5, 6, 7, 1 };
            int result = s.solution(7, A);
            Assert.AreEqual(6, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = new int[] { 2, 3, 4, 5, 6, 7, 1 };
            int result = s.solution(8, A);
            Assert.AreEqual(-1, result);
        }
    }
}
