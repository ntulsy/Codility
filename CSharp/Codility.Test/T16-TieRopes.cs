using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TieRopes;

namespace Codility.Test
{
    [TestClass]
    public class TieRopesTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] A = { 1, 2, 3, 4, 1, 1, 3 };
            int result = s.solution(4, A);
            Assert.AreEqual(3, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] A = { 1, 2, 3, 4, 1, 1, 3 };
            int result = s.solution(1, A);
            Assert.AreEqual(7, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] A = { 1 };
            int result = s.solution(1, A);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] A = { 1, 3, 4 };
            int result = s.solution(10, A);
            Assert.AreEqual(0, result);
        }
    }
}
