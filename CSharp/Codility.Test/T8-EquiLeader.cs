using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using EquiLeader;

namespace Codility.Test
{
    [TestClass]
    public class EquiLeaderTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] H = new int[] { 4, 3, 4, 4, 4, 2 };
            int result = s.solution(H);
            Assert.AreEqual(2, result);
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
            int[] H = new int[] { 1, 1, 1, 1, 1, 1 };
            int result = s.solution(H);
            Assert.AreEqual(5, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] H = new int[] { 1, 1 };
            int result = s.solution(H);
            Assert.AreEqual(1, result);
        }
    }
}
