using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using NumberSolitaire;

namespace Codility.Test
{
    [TestClass]
    public class NumberSolitaireTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { 1, -2, 0, 9, -1, -2 };
            int result = s.solution(A);
            Assert.AreEqual(8, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { 1, 10 };
            int result = s.solution(A);
            Assert.AreEqual(11, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = Enumerable.Repeat(10000, 100000).ToArray();
            int result = s.solution(A);
            Assert.AreEqual(1e9, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = { -1, 2, 3, 4, 5, -3, 2, -1 };
            int result = s.solution(A);
            Assert.AreEqual(14, result);
        }
    }
}
