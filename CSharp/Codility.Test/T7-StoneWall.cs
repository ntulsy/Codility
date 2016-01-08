using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using StoneWall;

namespace Codility.Test
{
    [TestClass]
    public class StoneWallTest
    {
        [TestMethod]
        public void TestMethod1()
        {
            Solution s = new Solution();
            int[] H = new int[] { 8, 8, 5, 7, 9, 8, 7, 4, 8 };
            int result = s.solution(H);
            Assert.AreEqual(7, result);
        }

        [TestMethod]
        public void TestMethod2()
        {
            Solution s = new Solution();
            int[] H = new int[] { 1 };
            int result = s.solution(H);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod3()
        {
            Solution s = new Solution();
            int[] H = new int[] { 1, 1, 1, 1, 1, 1 };
            int result = s.solution(H);
            Assert.AreEqual(1, result);
        }

        [TestMethod]
        public void TestMethod4()
        {
            Solution s = new Solution();
            int[] H = new int[] { 1, 2, 3, 4, 5 };
            int result = s.solution(H);
            Assert.AreEqual(5, result);
        }

        [TestMethod]
        public void TestMethod5()
        {
            Solution s = new Solution();
            int[] H = new int[] { 5, 4, 3, 2, 1 };
            int result = s.solution(H);
            Assert.AreEqual(5, result);
        }

        [TestMethod]
        public void TestMethod6()
        {
            Solution s = new Solution();
            int[] H = new int[] { 5, 4, 3, 2, 1, 4 };
            int result = s.solution(H);
            Assert.AreEqual(6, result);
        }

        [TestMethod]
        public void TestMethod7()
        {
            Solution s = new Solution();
            int[] H = new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
            int result = s.solution(H);
            Assert.AreEqual(5, result);
        }
    }
}
